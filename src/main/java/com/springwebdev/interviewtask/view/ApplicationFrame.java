package com.springwebdev.interviewtask.view;

import com.springwebdev.interviewtask.service.ApplicationService;
import com.springwebdev.interviewtask.service.impl.ApplicationServiceImpl;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ApplicationFrame extends Frame {

    private ApplicationService applicationService;

    private final int HEIGHT = 300;

    private final int WIDTH = 300;

    private Button quitButton;


    public ApplicationFrame() throws HeadlessException {
        super();
        applicationService = new ApplicationServiceImpl();
        initialize();
    }
    private void initialize() {
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setResizable(false);
        setUndecorated(true);
        setBackground(Color.GRAY);
        add(getQuitButton());
        setWindowListener();
    }

    private void setWindowListener() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
                dispose();
            }
        });
    }

    private Button getQuitButton() {
        if (quitButton == null) {
            quitButton = new Button();
            quitButton.setSize(100, 30);
            quitButton.setLabel("Quit");
            quitButton.setVisible(true);
            quitButton.addActionListener(e -> applicationService.quitApplication());
        }
        return quitButton;
    }
}
