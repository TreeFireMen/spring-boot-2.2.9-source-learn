package com.hand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-31
 */
@RestController
public class TestController {

	@RequestMapping("/hi")
	public String show() {
		return "hello";
	}
}
