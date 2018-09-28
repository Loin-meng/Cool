package com.lanou3g.demo.mapper;

import com.lanou3g.demo.entity.User;
import com.lanou3g.demo.entity.ex.MoneyOrder;
import com.lanou3g.demo.entity.ex.MoneyUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class UserMapperTest {

    private SqlSessionFactory sessionFactory;
    private UserMapper userMapper;
    private SqlSession session;

    @Before
    public void setUp() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(in);
        session = sessionFactory.openSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    @Test
    public void findAllWithUser() {
        List<MoneyUser> userList = userMapper.findAllWithUser();
        userList.forEach(System.out::println);
    }


    @Test
    public void findAllByCondition() {
        Map<String, Object> condition = new HashMap<>();
//        condition.put("userName","小%");
//        condition.put("gender","女");
//        condition.put("minHeight",1.70);
        condition.put("maxHeight", 1.80);

//        Date birthday =  Date.valueOf("1986-01-25");
//        condition.put("birthday","1986-01-25");

        List<User> userList = userMapper.findAllByCondition(condition);
        userList.forEach(System.out::println);


    }

    @Test
    public void findAll() {
        Map<String, Object> condition = new HashMap<>();
//        condition.put("userName", "小%");
//        condition.put("gender", "女");
//        condition.put("minHeight", 1.70);
//        condition.put("maxHeight", 1.80);
//        Date birthday = Date.valueOf("1986-01-25");
//        condition.put("birthday", "1986-01-25");
        List<User> userList = userMapper.findAll(condition);
        userList.forEach(System.out::println);

    }

    @Test
    public void updateOne(){
        User user = new User();
        user.setUserId(1);
        user.setHeight(1.90F);
        user.setWeight(78.00F);
        user.setUserName("马超");
        int updateOne = userMapper.updateOne(user);
        System.out.println(updateOne);
        session.commit();
        session.close();
    }

    @Test
    public void deleteByUserIds(){
//        因为有外键约束,所有删除出错属于正常,删除外键就可以正常删除
        List<Integer> ids = new ArrayList<>();
//        ids.add(1);
//        ids.add(2);
//        ids.add(6);
        int count = userMapper.deleteByUserIds(ids);
        System.out.println(count);
    }

    @Test
    public void addUsers(){
        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setUserName("张飞");
        u1.setGender("男");
        u1.setHeight(1.88F);
        u1.setWeight(88.00F);
        User u2 = new User();
        u2.setUserName("张超");
        u2.setGender("男");
        u2.setHeight(1.89F);
        u2.setWeight(88.11F);
        users.add(u1);
        users.add(u2);
        int addUsers = userMapper.addUsers(users);
        System.out.println(addUsers);
//        session.commit();
//        session.close();
    }
}