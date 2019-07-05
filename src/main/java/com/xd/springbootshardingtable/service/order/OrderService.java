package com.xd.springbootshardingtable.service.order;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xd.springbootshardingtable.entity.Order;
import com.xd.springbootshardingtable.entity.User;

import java.util.List;

public interface OrderService extends IService<Order> {


    @Override
    boolean save(Order entity);

    List<Order> getUserList();
}
