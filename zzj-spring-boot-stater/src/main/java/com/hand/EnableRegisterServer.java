package com.hand;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hand.config.ConfigMarker;
import org.springframework.context.annotation.Import;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-27
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ConfigMarker.class)  // 将某个组件类生成实例，添加到容器中
public @interface EnableRegisterServer {
}
