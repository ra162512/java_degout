package com.daoimpl;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.TemCalendarDao;
import com.entities.TemCalendar;


public class TestTemCalendar {
	
	private static ClassPathXmlApplicationContext context;
	private static TemCalendarDao temcalendarDao;
	
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("context.xml");
		temcalendarDao = (TemCalendarDao) context.getBean("TemCalendarDao");
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();

	}
	
	
	@Test
	public void test() {
		TemCalendar newTemCalendar = new TemCalendar();
		newTemCalendar.setCid(4);
		newTemCalendar.setDay("Lundi");
		newTemCalendar.setDate("2018-04-05");
		newTemCalendar.setPart("morning");
		temcalendarDao.saveOrUpdate(newTemCalendar);
	}			
	
}
