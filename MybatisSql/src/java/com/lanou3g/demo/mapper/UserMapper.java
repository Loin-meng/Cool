package com.lanou3g.demo.mapper;

import com.lanou3g.demo.entity.User;
import com.lanou3g.demo.entity.ex.MoneyOrder;
import com.lanou3g.demo.entity.ex.MoneyUser;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<MoneyUser> findAllWithUser();

    /**
     * 进行多条件查询
     * select * from tb_user
     * username     and user_name like ?
     * gender       and gender = ?
     * minHeight    and height >= ?
     * maxHeight    and height <= ?
     * minweight    and weight >= ?
     * maxweight    and weight <= ?
     * birthday     and birthday = ?
     * @param condition
     * @return
     */
    List<User> findAllByCondition(Map<String,Object> condition);

    /**
     * 进行多条件查询
     * select * from tb_user
     * username     and user_name like ?
     * gender       and gender = ?
     * minHeight    and height >= ?
     * maxHeight    and height <= ?
     * minweight    and weight >= ?
     * maxweight    and weight <= ?
     * birthday     and birthday = ?
     * @param condition
     * @return
     */
    List<User> findAll(Map<String,Object> condition);

    /**
     * 根据userId更新一条数据
     * @param user
     * @return
     */
    int updateOne(User user);

    /**
     * 根据userId更新集合中的所有User对象
     * @param users
     * @return
     */
    default int updateUsers(List<User> users){
        int sum = 0;
        for (User user : users) {
            int i = updateOne(user);
            sum += i;
        }
        return sum;
    }


    /**
     * 将集合中所有userId对应的数据删除掉
     * delete from tb_user where user_id in (1,2,6)
     * @param ids
     * @return
     */
    int deleteByUserIds(List<Integer> ids);

    /**
     * 批量插入
     * insert into tb_user (user_name,gender,height,weight)
     * values("李四","男",1.85F,77.00F,1995-06-12,)
     * @param users
     * @return
     */
    int addUsers(List<User> users);

}
