package com.ahanchar.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceA {

    private ProjectServiceB projectServiceB;

    public ProjectServiceA(@Lazy ProjectServiceB projectServiceB) {
        this.projectServiceB = projectServiceB;
    }

}
