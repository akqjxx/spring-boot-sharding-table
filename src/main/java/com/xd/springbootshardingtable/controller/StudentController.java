package com.xd.springbootshardingtable.controller;

import com.xd.springbootshardingtable.entity.Log;
import com.xd.springbootshardingtable.entity.Student;
import com.xd.springbootshardingtable.service.log.LogService;
import com.xd.springbootshardingtable.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/select")
    public List<Student> select() {
        return studentService.getUserList();
    }

    @GetMapping("/insert")
    public Boolean insert(Student order) {
        return studentService.save(order);
    }

}
