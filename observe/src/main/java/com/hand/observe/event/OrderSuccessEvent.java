package com.hand.observe.event;

import com.hand.observe.bean.Order;
import org.springframework.context.ApplicationEvent;

/** 事件
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
public class OrderSuccessEvent extends ApplicationEvent {

	private Order order;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public OrderSuccessEvent(Object source) {
		super(source);
	}

	public OrderSuccessEvent(Object source, Order order) {
		super(source);
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
