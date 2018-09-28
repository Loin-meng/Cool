package com.lanou3g.demo.mapper;


import com.lanou3g.demo.entity.Order;
import com.lanou3g.demo.entity.ex.MoneyOrder;

import java.util.List;

public interface OrderMapper {

    List<Order> findAllWithItem();

    Order findOneWithItem(Integer orderId);

    List<MoneyOrder> findAllWithMoney();


}
