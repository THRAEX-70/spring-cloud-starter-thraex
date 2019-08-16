package org.thraex.spring.cloud.netflix.eureka.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 鬼王
 * @Date 2019/08/16 09:13
 */
@ConfigurationProperties(ThraexEurekaClientConfigBean.PREFIX)
public class ThraexEurekaClientConfigBean {

    /**
     * Default prefix for THRAEX Eureka client config properties.
     */
    public static final String PREFIX = "eureka.client.thraex";

    /**
     * Flag to indicate that the THRAEX Eureka client is enabled.
     */
    private boolean enabled = true;

    /**
     * 可用性区域与Eureka服务器通信的完全限定url列表。每个值可以是一个URL或一个逗号分隔的备选位置列表。
     *
     * @see org.springframework.cloud.netflix.eureka.EurekaClientConfigBean#serviceUrl
     */
    private Map<String, String> serviceUrl = new HashMap<>();

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, String> getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(Map<String, String> serviceUrl) {
        this.serviceUrl = serviceUrl;
    }
}
