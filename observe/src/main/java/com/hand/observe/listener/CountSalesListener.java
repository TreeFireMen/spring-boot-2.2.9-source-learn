package com.hand.observe.listener;

import com.hand.observe.event.OrderSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 使用@EventListener替代实现接口ApplicationLister
 *
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
@Component
public class CountSalesListener {

	@EventListener
	public void countSales(OrderSuccessEvent event) {
		System.out.println("CountSalesListener.countSales : " + event.getOrder());
	}

}
