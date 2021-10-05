package com.huguoya.testdocker.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author huguo
 */
@Service
@Slf4j
public class TestService {
    public String t1() {
        log.info(LocalDateTime.now().toString());
        return LocalDateTime.now().toString();
    }
}
