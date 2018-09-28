package com.lanou3g.demo.mapper;

import com.lanou3g.demo.entity.Order;
import com.lanou3g.demo.entity.ex.MoneyOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class OrderMapperTest {

    private SqlSessionFactory sessionFactory;
    private OrderMapper orderMapper;

    @Before
    public void setUp() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sessionFactory.openSession();
        orderMapper = session.getMapper(OrderMapper.class);

    }

    @Test
    public void findAllWithItem() {
        List<Order> orderList = orderMapper.findAllWithItem();
        orderList.forEach(System.out::println);


    }

    @Test
    public void findOneWithItem() {
        Order oneWithItem = orderMapper.findOneWithItem(4);
        System.out.println(oneWithItem);
    }

    @Test
    public void findAllWithMoney() {
        List<MoneyOrder> moneyOrderList = orderMapper.findAllWithMoney();
        moneyOrderList.forEach(System.out::println);
    }
}