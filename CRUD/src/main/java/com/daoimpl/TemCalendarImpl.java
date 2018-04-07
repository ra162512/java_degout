package com.daoimpl;
 
import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.daoapi.TemCalendarDao;
import com.entities.TemCalendar;
 
@Repository("TemCalendarDao")
@Transactional
public class TemCalendarImpl implements TemCalendarDao {
 
    @Autowired
    SessionFactory session;
 
    public boolean saveOrUpdate(TemCalendar temCalendar) {
        // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(temCalendar);

        return true;
    }
 
    public List<TemCalendar> list() {
        return session.getCurrentSession().createQuery("from TemCalendar").list();
    }
 
    public boolean delete(TemCalendar temCalendar) {
        try {
            session.getCurrentSession().delete(temCalendar);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
    }
}