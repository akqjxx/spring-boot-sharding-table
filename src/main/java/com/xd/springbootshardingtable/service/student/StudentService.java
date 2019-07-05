package com.xd.springbootshardingtable.service.student;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xd.springbootshardingtable.entity.Order;
import com.xd.springbootshardingtable.entity.Student;

import java.util.List;

public interface StudentService extends IService<Student> {


    @Override
    boolean save(Student entity);

    List<Student> getUserList();
}
