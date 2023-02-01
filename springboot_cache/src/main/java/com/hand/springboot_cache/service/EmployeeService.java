package com.hand.springboot_cache.service;

import com.hand.springboot_cache.entity.Employee;
import com.hand.springboot_cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-01
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	public Employee getEmpById(int id) {
		return employeeMapper.getEmpById(id);
	}


}
