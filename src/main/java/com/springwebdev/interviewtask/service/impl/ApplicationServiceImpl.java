package com.springwebdev.interviewtask.service.impl;

import com.springwebdev.interviewtask.service.ApplicationService;

public class ApplicationServiceImpl implements ApplicationService {

    @Override
    public void quitApplication() {
        System.exit(0);
    }

    @Override
    public String getAboutApplication() {
        return "Java Spring Web Developer Interview Task";
    }

}
