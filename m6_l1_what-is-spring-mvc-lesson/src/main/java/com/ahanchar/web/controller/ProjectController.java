package com.ahanchar.web.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahanchar.persistence.model.Project;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @GetMapping("/1")
    public Project findOne() {
        return new Project("testName", LocalDate.now());
    }

}
