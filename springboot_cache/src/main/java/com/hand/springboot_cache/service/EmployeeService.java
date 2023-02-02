package com.hand.springboot_cache.service;

import com.hand.springboot_cache.entity.Employee;
import com.hand.springboot_cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-01
 */
@Service
@CacheConfig(cacheNames = {"emp"})
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	/**
	 * @param value
	 * @param cacheNames    ：指定缓存的名称，cacheManager是管理多个cache，以名称进行区分
	 * @param key           ：缓存数据时指定key值(key,value),默认是方法的参数值,也可以使用spel来计算key的值
	 * @param keyGenerator  : key的生成策略,和key进行二选一
	 * @param cacheManager: 指定缓存管理器 reids:emp  ehcache:emp
	 * @param cacheReslver: 功能和  cacheManager 一样
	 * @param condition:    条件属性,满足这个条件进行缓存
	 * @param unless:       满足这个条件,不进行缓存
	 * @param sync:         是否使用异步模式进行缓存
	 *                      (1) condition/unless 同时满足,不缓存
	 *                      (2) sync的值为true的时候,unless 不被支持
	 * @Cacheable : 缓存查询：会将该方法的返回值存到缓存中
	 */
	@Cacheable( key = "#id", condition = "#id > 0", unless = "#result == null")
	public Employee getEmpById(int id) {
		return employeeMapper.getEmpById(id);
	}

	/**
	 * @Cacheput : 需要和更新的缓存的名称相同, key也需要相同,不指定key的话默认使用employee对象作为key
	 */
	@CachePut( key = "#employee.id")
	public Employee updateEmp(Employee employee) {
		employeeMapper.updateEmp(employee);
		return employee;
	}


	@CacheEvict( key = "#id", beforeInvocation = true)
	public void deleteEmp(int id) {
		employeeMapper.deleteEmpById(id);
	}


}
