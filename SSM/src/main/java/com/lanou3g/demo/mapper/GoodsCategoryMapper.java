package com.lanou3g.demo.mapper;

import com.lanou3g.demo.entity.GoodsCategory;

import java.util.List;

public interface GoodsCategoryMapper {

    List<GoodsCategory> findAll();

    int addOne(GoodsCategory category);
}
