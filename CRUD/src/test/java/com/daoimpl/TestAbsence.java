package com.daoimpl;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.AbsenceDao;
import com.entities.Absence;


public class TestAbsence {

	private static ClassPathXmlApplicationContext context;
	private static AbsenceDao absenceDao;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("context.xml");
		absenceDao = (AbsenceDao) context.getBean("AbsenceDao");

	}
	
	@After
	public void tearDown() throws Exception {
		context.close();

	}
	
	
	@Test
	public void test() {
		Absence newAbsence = new Absence();
		newAbsence.setName("test");
		newAbsence.setDay("Lundi");
		newAbsence.setDate("2018-05-05");
		newAbsence.setPart("morning");
		newAbsence.setContent("day off");
		absenceDao.saveOrUpdate(newAbsence);

	}
	
}
