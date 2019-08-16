package org.thraex.spring.cloud.netflix.eureka.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Provides a more succinct conditional <code>eureka.client.enabled</code>.
 *
 * @Author 鬼王
 * @Date 2019/08/16 11:25
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ConditionalOnProperty(value = "eureka.client.enabled", matchIfMissing = true)
public @interface ConditionalOnEurekaClientEnabled {

}
