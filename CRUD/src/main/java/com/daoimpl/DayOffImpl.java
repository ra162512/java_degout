package com.daoimpl;
 
import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.daoapi.DayOffDao;
import com.entities.DayOff;
 
@Repository("DayOffDao")
@Transactional
public class DayOffImpl implements DayOffDao {
 
    @Autowired
    SessionFactory session;
 
    public boolean saveOrUpdate(DayOff dayOff) {
        // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(dayOff);

        return true;
    }
 
    public List<DayOff> list() {
        return session.getCurrentSession().createQuery("from DayOff").list();
    }
 
    public boolean delete(DayOff dayOff) {
        try {
            session.getCurrentSession().delete(dayOff);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
    }
}