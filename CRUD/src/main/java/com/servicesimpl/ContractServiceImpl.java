package com.servicesimpl;
 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.daoapi.ContractDao;
import com.entities.Contract;
import com.servicesapi.ContractService;
 
@Service
public class ContractServiceImpl implements ContractService {
 
    @Autowired
    ContractDao userDao;
 
    public boolean saveOrUpdate(Contract contract) {
        return userDao.saveOrUpdate(contract);
    }
 
    public List<Contract> list() {
        // TODO Auto-generated method stub
        return userDao.list();
    }
 
    public boolean delete(Contract contract) {
        // TODO Auto-generated method stub
        return userDao.delete(contract);
    }
 
}