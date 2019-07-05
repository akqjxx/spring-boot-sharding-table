package com.xd.springbootshardingtable.service.log;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xd.springbootshardingtable.entity.Log;

import java.util.List;

public interface LogService extends IService<Log> {

    @Override
    boolean save(Log entity);

    List<Log> getUserList();
}
