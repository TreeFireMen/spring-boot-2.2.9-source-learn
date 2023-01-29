package com.hand.springbootdataaccess.controller;

import com.hand.springbootdataaccess.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-29
 */
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;


	@RequestMapping("/findAllM")
	public String findAllM() {
		productService.findAllProductM();
		return "m";
	}

	@RequestMapping("/findAllS")
	public String findAllS() {
		productService.findAllProductS();
		return "s";
	}





}
