package org.thraex.spring.cloud.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.thraex.spring.cloud.sample.property.ThraexProperties;

/**
 * @Author 鬼王
 * @Date 2019/08/15 15:41
 */
@Service
public class ThraexService {

    @Autowired
    private ThraexProperties properties;

    @Value("${spring.application.name:THRAEX-APPLICATION}")
    private String appName;

    public String test(String name) {
        return "Welcome to " + appName + "[" + properties.getKeyword() + "]: " + name;
    }

}
