package com.xd.springbootshardingtable.service.student.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.springbootshardingtable.entity.Student;
import com.xd.springbootshardingtable.mapper.student.StudentMapper;
import com.xd.springbootshardingtable.service.student.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
        implements StudentService {

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Student> getUserList() {
        return baseMapper.selectList(Wrappers.<Student>lambdaQuery());
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean save(Student entity) {
        return super.save(entity);
    }
}
