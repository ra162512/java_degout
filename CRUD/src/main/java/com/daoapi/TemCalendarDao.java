package com.daoapi;

import java.util.List;

import com.entities.TemCalendar;

public interface TemCalendarDao {
	public boolean saveOrUpdate(TemCalendar temCalendar);
	 
    public List<TemCalendar> list();
 
    public boolean delete(TemCalendar temCalendar);
}
