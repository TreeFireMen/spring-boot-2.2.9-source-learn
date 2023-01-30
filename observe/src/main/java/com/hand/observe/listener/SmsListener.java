package com.hand.observe.listener;

import com.hand.observe.event.OrderSuccessEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


/**
 * 发送短信的事件监听器
 *
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-30
 */
@Component
public class SmsListener implements ApplicationListener<OrderSuccessEvent> {


	Logger logger = LoggerFactory.getLogger(SmsListener.class);

	@Override
	public void onApplicationEvent(OrderSuccessEvent event) {
		logger.info("短信发送成功....." + event.getOrder().getName());
	}
}
