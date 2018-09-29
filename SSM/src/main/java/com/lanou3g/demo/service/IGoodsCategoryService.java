package com.lanou3g.demo.service;

import com.lanou3g.demo.entity.GoodsCategory;

import java.util.List;

public interface IGoodsCategoryService {

    void addCategory(GoodsCategory category);

    List<GoodsCategory> findAll();
}
