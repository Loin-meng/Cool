package com.lanou3g.demo.entity.ex;

import com.lanou3g.demo.entity.Order;

public class MoneyOrder extends Order {

    private Float totalMoney;

    @Override
    public String toString() {
        return "MoneyOrder{" +
                "totalMoney=" + totalMoney +
                "} " + super.toString();
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }
}
