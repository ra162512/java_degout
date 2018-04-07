package com.daoimpl;
 
import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.daoapi.RegCalendarDao;
import com.entities.RegCalendar;
 
@Repository("RegCalendarDao")
@Transactional
public class RegCalendarImpl implements RegCalendarDao {
 
    @Autowired
    SessionFactory session;
 
    public boolean saveOrUpdate(RegCalendar regCalendar) {
        // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(regCalendar);

        return true;
    }
 
    public List<RegCalendar> list() {
        return session.getCurrentSession().createQuery("from RegCalendar").list();
    }
 
    public boolean delete(RegCalendar regCalendar) {
        try {
            session.getCurrentSession().delete(regCalendar);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
    }
}