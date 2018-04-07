package com.daoimpl;


import static org.junit.Assert.*;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.ChildDao;
import com.entities.Child;




public class TestChild {
	
	private static ClassPathXmlApplicationContext context;
	private static ChildDao childDao;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("context.xml");
		childDao = (ChildDao) context.getBean("ChildDao");

	}

	
	@After
	public void tearDown() throws Exception {
		context.close();

	}
	
	
	@Test
	public void test() {
		Child newChild = new Child();
		newChild.setName("test");
		newChild.setBirth("2018-05-11");
		childDao.saveOrUpdate(newChild);

	}
}
