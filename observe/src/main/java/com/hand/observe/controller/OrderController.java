package com.hand.observe.controller;

import com.hand.observe.bean.Order;
import com.hand.observe.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
@RestController
@RequestMapping("/order")
public class OrderController {


	@Autowired
	private OrderService orderService;


	@RequestMapping("/buy")
	public Order getOrder() {
		Order order = new Order(1, "aaa");
		orderService.buy(order);
		return order;
	}



}
