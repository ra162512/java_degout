package com.daoapi;

import java.util.List;

import com.entities.Absence;

public interface AbsenceDao {
	public boolean saveOrUpdate(Absence absence);
	 
    public List<Absence> list();
 
    public boolean delete(Absence absence);
}
