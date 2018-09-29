package com.lanou3g.demo.entity;

public class GoodsCategory {

    private Integer categoryId;
    private String categoryName;

    @Override
    public String toString() {
        return "GoodsCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
