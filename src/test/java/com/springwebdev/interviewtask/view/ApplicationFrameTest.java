package com.springwebdev.interviewtask.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationFrameTest {

    private ApplicationFrame applicationFrame;

    @BeforeEach
    void setUp() {
        applicationFrame = new ApplicationFrame();
    }

    @AfterEach
    void tearDown() {
        applicationFrame.dispose();
    }

    @Test
    void validateHeight() {
        final int expectedHeight = 300;

        final int actualHeight = applicationFrame.getHeight();

        assertEquals(expectedHeight, actualHeight);
    }
    @Test
    void validateWidth() {
        final int expectedWidth = 300;

        final int actualWidth = applicationFrame.getWidth();

        assertEquals(expectedWidth, actualWidth);
    }

    @Test
    void validateResizability() {
        assertFalse(applicationFrame.isResizable());
    }
}
