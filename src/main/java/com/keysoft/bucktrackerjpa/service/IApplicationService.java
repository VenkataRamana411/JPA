package com.keysoft.bucktrackerjpa.service;

import com.keysoft.bucktrackerjpa.entity.Application;

public interface IApplicationService {
    boolean addApplication(Application application);

    Application getApplicationById(int id);

    void updateApplication(Application application);
}
