package com.daoapi;

import java.util.List;

import com.entities.RegCalendar;

public interface RegCalendarDao {
	public boolean saveOrUpdate(RegCalendar regCalendar);
	 
    public List<RegCalendar> list();
 
    public boolean delete(RegCalendar regCalendar);
}
