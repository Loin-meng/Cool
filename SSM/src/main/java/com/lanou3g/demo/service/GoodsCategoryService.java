package com.lanou3g.demo.service;

import com.lanou3g.demo.entity.GoodsCategory;
import com.lanou3g.demo.mapper.GoodsCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsCategoryService implements IGoodsCategoryService {

    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    /*
    @Transactional 标记的方法会放到一个事务中.
    如果标记的是类, 那么这个类中的所有方法都在各自的事务中.
    readOnly属性默认值为false, 如果设置为true, 那么被标记的方法就
    不会放到事务里
     */
    @Transactional
    @Override
    public void addCategory(GoodsCategory category) {
        goodsCategoryMapper.addOne(category);
//        int x = 1 / 0;
    }

    @Override
    public List<GoodsCategory> findAll() {
        return goodsCategoryMapper.findAll();
    }
}
