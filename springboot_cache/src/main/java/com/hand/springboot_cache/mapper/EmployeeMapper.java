package com.hand.springboot_cache.mapper;

import com.hand.springboot_cache.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-01
 */
public interface EmployeeMapper {

	@Select("SELECT * FROM employee WHERE id = #{id}")
	Employee getEmpById(int id);

	@Insert("INSERT INTO employee(lastName,email,gender,d_id)" +
			" values (#{lastName},#{email},#{gender}, #{dId})")
	void insertEmp(Employee employee);

	@Update("UPDATE employee SET lastName = #{lastName}, email = #{email}," +
			"gender = #{gender}, d_id =  #{dId} WHERE id = #{id}")
	void updateEmp(Employee employee);


	@Delete("DELETE FROM employee WHERE id = #{id}")
	void deleteEmpById(int id);


}
