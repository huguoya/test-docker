package com.huguoya.testdocker.service;


import com.huguoya.testdocker.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author huguo
 */
@Service
@Slf4j
public class StudentService {

  public Student getStudentInfo() {
    Student stu = new Student();
    stu.setId(1);
    stu.setName("王小明");
    stu.setAge(18);
    stu.setSayWord("hello world");
    return stu;
  }
}
