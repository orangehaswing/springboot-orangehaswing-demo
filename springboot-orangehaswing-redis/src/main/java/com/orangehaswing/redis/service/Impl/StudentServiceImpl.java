package com.orangehaswing.redis.service.Impl;

import com.orangehaswing.redis.bean.Student;
import com.orangehaswing.redis.mapper.StudentMapper;
import com.orangehaswing.redis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student update(Student student) {
        this.studentMapper.update(student);
        return this.studentMapper.queryStudentBySno(student.getSno());
    }

    @Override
    public void deleteStudentBySno(String sno) {
        this.studentMapper.deleteStudentBySno(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }

}