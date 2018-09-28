package com.lanou3g.demo.entity.ex;

import com.lanou3g.demo.entity.User;

public class MoneyUser extends User {

    private Float totalMoney;

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "MoneyUser{" +
                "totalMoney=" + totalMoney +
                '}' + super.toString();
    }
}
