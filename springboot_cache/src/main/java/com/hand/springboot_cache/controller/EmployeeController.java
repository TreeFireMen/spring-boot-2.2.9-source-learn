package com.hand.springboot_cache.controller;

import com.hand.springboot_cache.entity.Employee;
import com.hand.springboot_cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-01
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/emp/{id}")
	public Employee getEmpById(@PathVariable("id") Integer id) {
		return employeeService.getEmpById(id);
	}
}
