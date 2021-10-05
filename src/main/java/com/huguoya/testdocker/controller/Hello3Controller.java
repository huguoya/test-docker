package com.huguoya.testdocker.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.huguoya.testdocker.entity.Student;
import com.huguoya.testdocker.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huguo
 */
@ApiSupport(author = "huguoya Controller")
@RestController
public class Hello3Controller {
    @Resource
    StudentService studentService;
    @ApiOperationSupport(author = "huguoya method")
    @GetMapping(value = {"/hello3/say"})
    public Student say() {
        return studentService.getStudentInfo();
    }
}
