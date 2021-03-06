package com.keysoft.bucktrackerjpa.service;

import com.keysoft.bucktrackerjpa.dao.IApplicationDAO;
import com.keysoft.bucktrackerjpa.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService implements IApplicationService{

    @Autowired
    private IApplicationDAO applicationDAO;

    @Override
    public synchronized boolean addApplication(Application application) {
        if (applicationDAO.applicationExists(application.getName(), application.getOwner())) {
            return false;
        } else{
            applicationDAO.addApplication(application);
            return true;
        }
    }

    @Override
    public Application getApplicationById(int id) {
        return applicationDAO.getApplicationById(id);
    }

    @Override
    public void updateApplication(Application application) {
       applicationDAO.updateApplication(application);
    }
}
