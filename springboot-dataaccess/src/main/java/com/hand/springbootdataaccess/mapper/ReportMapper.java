package com.hand.springbootdataaccess.mapper;

import java.util.List;

import com.hand.springbootdataaccess.pojo.Report;
import org.apache.ibatis.annotations.Select;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-01-29
 */
public interface ReportMapper {

	@Select("select * from report;")
	List<Report> findAllReport();
}
