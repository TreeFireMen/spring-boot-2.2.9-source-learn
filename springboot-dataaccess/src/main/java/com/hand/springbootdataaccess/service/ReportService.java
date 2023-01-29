package com.hand.springbootdataaccess.service;

import java.util.List;

import com.hand.springbootdataaccess.mapper.ReportMapper;
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
public class ReportService {

	Log log = LogFactory.getLog(ReportService.class);


	@Autowired
	private ReportMapper reportMapper;


	public List<Report> findAllReport() {

		List<Report> allReport = reportMapper.findAllReport();
		log.info("查询到的信息: " + allReport);
		return allReport;
	}


}
