package com.hand.springbootdataaccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import com.hand.springbootdataaccess.pojo.SimpleBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootDataaccessApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private SimpleBean simpleBean;

	@Test
	void contextLoads() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println("connection:------" + connection);
		simpleBean.getAge();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from report");
		resultSet.next();
		System.out.println(resultSet.getString(2));

	}

}
