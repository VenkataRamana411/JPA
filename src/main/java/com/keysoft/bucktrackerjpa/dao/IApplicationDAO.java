package com.keysoft.bucktrackerjpa.dao;

import com.keysoft.bucktrackerjpa.entity.Application;

public interface IApplicationDAO {
    void addApplication(Application application);
    boolean applicationExists(String name, String owner);

    Application getApplicationById(int id);

    void updateApplication(Application application);
}
