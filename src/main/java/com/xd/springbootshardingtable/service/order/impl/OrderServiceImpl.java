package com.xd.springbootshardingtable.service.order.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.springbootshardingtable.entity.Order;

import com.xd.springbootshardingtable.mapper.order.OrderMapper;
import com.xd.springbootshardingtable.service.order.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Order> getUserList() {
        return baseMapper.selectList(Wrappers.<Order>lambdaQuery());
    }

    // @Sharding
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean save(Order entity) {
        return super.save(entity);
    }
}
