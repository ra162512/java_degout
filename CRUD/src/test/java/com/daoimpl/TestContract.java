package com.daoimpl;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.ContractDao;
import com.entities.Contract;


public class TestContract {
	
	private static ClassPathXmlApplicationContext context;
	private static ContractDao contractDao;
	
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("context.xml");
		contractDao = (ContractDao) context.getBean("ContractDao");

	}
	
	@After
	public void tearDown() throws Exception {
		context.close();

	}
	
	@Test
	public void test() {
		Contract newContract = new Contract();
		newContract.setName("test");
		newContract.setBegDate("2018-05-05");
		newContract.setEndDate("2018-06-05");
		newContract.setType("tempory");
		newContract.setPhone("0145709353");
		newContract.setEmail("allam@gmail.com");
		contractDao.saveOrUpdate(newContract);
	}			

}
