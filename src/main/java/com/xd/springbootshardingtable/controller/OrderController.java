package com.xd.springbootshardingtable.controller;

import com.xd.springbootshardingtable.entity.Order;
import com.xd.springbootshardingtable.entity.User;
import com.xd.springbootshardingtable.service.UserService;
import com.xd.springbootshardingtable.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname UserController
 * @Description 用户测试控制类
 * @Author 李号东 lihaodongmail@163.com
 * @Date 2019-05-26 17:36
 * @Version 1.0
 */
@RestController
@RequestMapping(value ="/order" )
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/select")
    public List<Order> select() {
        return orderService.getUserList();
    }

    @GetMapping("/insert")
    public Boolean insert(Order order) {
        return orderService.save(order);
    }

}
