package com.hand.springbootdataaccess.mapper;

import java.util.List;

import com.hand.springbootdataaccess.pojo.Product;
import org.apache.ibatis.annotations.Select;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-29
 */
public interface ProductMapper {

	@Select("select * from product")
	List<Product> findAllProductM();

	@Select("select * from product")
	List<Product> findAllProductS();
}
