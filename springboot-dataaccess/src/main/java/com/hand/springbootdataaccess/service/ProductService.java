package com.hand.springbootdataaccess.service;

import java.util.List;

import com.hand.springbootdataaccess.mapper.ProductMapper;
import com.hand.springbootdataaccess.mapper.ReportMapper;
import com.hand.springbootdataaccess.pojo.Product;
import com.hand.springbootdataaccess.pojo.Report;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-29
 */
@Service
public class ProductService {

	Log log = LogFactory.getLog(ProductService.class);

	@Autowired
	private ProductMapper productMapper;

	public void findAllProductM() {
		List<Product> allProductM = productMapper.findAllProductM();
		System.out.println(allProductM);
	}

	public void findAllProductS() {
		List<Product> allProductS = productMapper.findAllProductS();
		System.out.println(allProductS);
	}


}
