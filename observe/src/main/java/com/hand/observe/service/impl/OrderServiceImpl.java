package com.hand.observe.service.impl;

import com.hand.observe.bean.Order;
import com.hand.observe.event.OrderSuccessEvent;
import com.hand.observe.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */

@Service
public class OrderServiceImpl implements OrderService {


	Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private ApplicationContext publisher;

	@Override
	public void buy(Order order) {
		logger.info("下单成功: " + order.getName());
		// 发布事件
		publisher.publishEvent(new OrderSuccessEvent(this, order));
	}
}
