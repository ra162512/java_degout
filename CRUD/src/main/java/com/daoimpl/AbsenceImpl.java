package com.daoimpl;
 
import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.daoapi.AbsenceDao;
import com.entities.Absence;
 
@Repository("AbsenceDao")
@Transactional
public class AbsenceImpl implements AbsenceDao {
 
    @Autowired
    SessionFactory session;
 
    public boolean saveOrUpdate(Absence absence) {
        // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(absence);

        return true;
    }
 
    public List<Absence> list() {
        return session.getCurrentSession().createQuery("from Absence").list();
    }
 
    public boolean delete(Absence absence) {
        try {
            session.getCurrentSession().delete(absence);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
    }
}