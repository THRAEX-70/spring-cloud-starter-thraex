package org.thraex.spring.cloud.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.thraex.spring.cloud.property.ThraexProperties;
import org.thraex.spring.cloud.service.ThraexService;

/**
 * <PRE>
 *     1. 声明为配置类
 *     2. 声明在Web应用下有效
 *     3. 启用配置功能(加入到IOC容器)
 *     4. 导入组件
 * </PRE>
 *
 * @Author 鬼王
 * @Date 2019/08/15 16:01
 */
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(ThraexProperties.class)
@Import(ThraexService.class)
public class ThraexAutoConfiguration {
}
