package org.thraex.spring.cloud.sample.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author 鬼王
 * @Date 2019/08/15 15:22
 */
@ConfigurationProperties("thraex")
public class ThraexProperties {

    /**
     * Application Keyword
     */
    private String keyword = "THRAEX";

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
