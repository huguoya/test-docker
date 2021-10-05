package com.huguoya.testdocker.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author huguo
 */
@Component
@Data
public class YmlConfig {
    @Value("${server.port}")
    public String port;
}
