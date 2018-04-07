package com.daoimpl;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.DayOffDao;
import com.entities.DayOff;


public class TestDayOff {
	
	private static ClassPathXmlApplicationContext context;
	private static DayOffDao dayoffDao;
	
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("context.xml");
		dayoffDao = (DayOffDao) context.getBean("DayOffDao");
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();

	}
	
	
	@Test
	public void test() {
		DayOff newDayOff = new DayOff();
		newDayOff.setDay("Mardi");
		newDayOff.setDate("2018-05-05");
		newDayOff.setPart("Morning");
		dayoffDao.saveOrUpdate(newDayOff);
	}			
	

}
