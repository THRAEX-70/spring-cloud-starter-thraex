package org.thraex.spring.cloud.netflix.eureka;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 鬼王
 * @Date 2019/08/16 08:38
 */
@Configuration
@EnableConfigurationProperties
@ConditionalOnProperty(value = { "eureka.client.enabled", "eureka.client.thraex.enabled" }, matchIfMissing = true)
public class ThraexEurekaClientAutoConfiguration {

    public ThraexEurekaClientAutoConfiguration() {
        System.out.println("HANZO-guiwang");
    }

}
