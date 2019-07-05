package com.xd.springbootshardingtable.service.log.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.springbootshardingtable.entity.Log;
import com.xd.springbootshardingtable.mapper.log.LogMapper;
import com.xd.springbootshardingtable.service.log.LogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class LogServiceImpl  extends ServiceImpl<LogMapper, Log>
        implements LogService {


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Log> getUserList() {
        return baseMapper.selectList(Wrappers.<Log>lambdaQuery());
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean save(Log entity) {
        return super.save(entity);
    }
}
