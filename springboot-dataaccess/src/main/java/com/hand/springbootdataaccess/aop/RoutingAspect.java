package com.hand.springbootdataaccess.aop;

import com.hand.springbootdataaccess.config.RoutingDataSourceContext;
import com.hand.springbootdataaccess.config.RoutingWith;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
@Aspect
@Component
public class RoutingAspect {

	@Around("@annotation(routingWith)")
	public Object routingWithDataSource(ProceedingJoinPoint joinPoint, RoutingWith routingWith) throws Throwable {
		new RoutingDataSourceContext(routingWith.key());
		return joinPoint.proceed();
	}
}
