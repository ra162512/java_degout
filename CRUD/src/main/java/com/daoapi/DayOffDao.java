package com.daoapi;

import java.util.List;

import com.entities.DayOff;

public interface DayOffDao {
	public boolean saveOrUpdate(DayOff dayOff);
	 
    public List<DayOff> list();
 
    public boolean delete(DayOff dayOff);
}
