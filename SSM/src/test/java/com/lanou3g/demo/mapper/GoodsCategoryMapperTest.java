package com.lanou3g.demo.mapper;

import com.lanou3g.demo.entity.GoodsCategory;
import com.lanou3g.demo.service.IGoodsCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml", "classpath:spring-service.xml"})
public class GoodsCategoryMapperTest {


    @Autowired
    private IGoodsCategoryService goodsCategoryService;
    @Test
    public void findAll() {
        GoodsCategory category = new GoodsCategory();
        category.setCategoryName("毒品");
        goodsCategoryService.addCategory(category);
    }
}