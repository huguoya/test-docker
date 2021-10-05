package com.huguoya.testdocker.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.huguoya.testdocker.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author huguo
 */
@ApiSupport(author = "huguoya Controller")
@RestController
public class Hello1Controller {
    @Resource
    TestService testService;
    @ApiOperationSupport(author = "huguoya method")
    @GetMapping(value = {"/hello1/say"})
    public String say() {
        return testService.t1();
    }
}
