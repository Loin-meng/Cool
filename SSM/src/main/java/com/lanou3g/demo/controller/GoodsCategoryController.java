package com.lanou3g.demo.controller;

import com.lanou3g.demo.entity.GoodsCategory;
import com.lanou3g.demo.service.IGoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class GoodsCategoryController {

    @Autowired
    private IGoodsCategoryService goodsCategoryService;

    @RequestMapping("/findAll")
    public List<GoodsCategory> findAll(){
        return goodsCategoryService.findAll();
    }

}
