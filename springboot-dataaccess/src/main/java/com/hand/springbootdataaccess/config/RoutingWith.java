package com.hand.springbootdataaccess.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RoutingWith {

	String key() default "master";
}
