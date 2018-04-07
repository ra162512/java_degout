package com.daoimpl;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.RegCalendarDao;
import com.entities.RegCalendar;


public class TestRegCalendar {
	
	
	private static ClassPathXmlApplicationContext context;
	private static RegCalendarDao regcalendarDao;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("context.xml");
		regcalendarDao = (RegCalendarDao) context.getBean("RegCalendarDao");
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();

	}
	
	
	@Test
	public void test() {
		RegCalendar newRegCalendar = new RegCalendar();
		newRegCalendar.setCid(4);
		newRegCalendar.setDay("Lundi");
		newRegCalendar.setPart("Morning");
		regcalendarDao.saveOrUpdate(newRegCalendar);
	}			

}
