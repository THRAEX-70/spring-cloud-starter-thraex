package org.thraex.spring.cloud.netflix.eureka;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thraex.spring.cloud.netflix.eureka.condition.ConditionalOnEurekaClientEnabled;
import org.thraex.spring.cloud.netflix.eureka.config.ThraexEurekaClientConfigBean;

/**
 * @Author 鬼王
 * @Date 2019/08/16 08:38
 */
@Configuration
@EnableConfigurationProperties
@ConditionalOnEurekaClientEnabled
@ConditionalOnProperty(value = "eureka.client.thraex.enabled", matchIfMissing = true)
public class ThraexEurekaClientAutoConfiguration {

    public ThraexEurekaClientAutoConfiguration() {
        System.out.println("HANZO-guiwang");
    }

    @Bean
    public ThraexEurekaClientConfigBean thraexEurekaClientConfigBean() {
        return new ThraexEurekaClientConfigBean();
    }

}
