package com.hand.observe;

import com.hand.observe.bean.Order;
import com.hand.observe.service.OrderService;
import com.hand.observe.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ObserveApplicationTests {

	@Autowired
	private OrderService orderServiceImpl;


	@Test
	void contextLoads() {
		Order o = new Order(1, "aaa");
		orderServiceImpl.buy(o);
	}

}
