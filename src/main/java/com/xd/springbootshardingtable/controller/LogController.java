package com.xd.springbootshardingtable.controller;

import com.xd.springbootshardingtable.entity.Log;
import com.xd.springbootshardingtable.service.log.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping(value = "/log")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/select")
    public List<Log> select() {
        return logService.getUserList();
    }

    @GetMapping("/insert")
    public Boolean insert(Log order) {
        return logService.save(order);
    }

}
