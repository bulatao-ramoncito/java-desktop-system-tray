package com.springwebdev.interviewtask.service;

import com.springwebdev.interviewtask.service.impl.ApplicationServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationServiceTest {

    ApplicationService applicationService;

    @BeforeEach
    void setUp() {
        applicationService = new ApplicationServiceImpl();
    }

    @Test
    void getAboutApplication() {
        final String expected = "Java Spring Web Developer Interview Task";

        final String actual = applicationService.getAboutApplication();

        assertEquals(expected, actual);
    }
}