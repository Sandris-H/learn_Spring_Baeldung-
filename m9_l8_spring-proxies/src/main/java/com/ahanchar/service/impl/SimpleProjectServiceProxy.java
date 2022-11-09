package com.ahanchar.service.impl;

import com.ahanchar.aspect.LoggingAspect;
import com.ahanchar.persistence.model.Project;

public class SimpleProjectServiceProxy extends SimpleProjectServiceImpl {

    @Override
    public Project save(Project project) {
        new LoggingAspect().before("save()");
        return super.save(project);
    }
}
