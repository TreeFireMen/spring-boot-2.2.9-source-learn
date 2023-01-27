package com.hand.mytest;

import com.hand.pojo.SimpleBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MyTestApplicationTests {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	void contextLoads() {
		System.out.println(simpleBean);
	}

}
