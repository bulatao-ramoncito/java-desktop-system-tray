package com.springwebdev.interviewtask.view;

import com.springwebdev.interviewtask.service.ApplicationService;
import com.springwebdev.interviewtask.service.impl.ApplicationServiceImpl;

import java.awt.*;

public class ApplicationTrayPopupMenu extends PopupMenu {

    private ApplicationService applicationService;

    private MenuItem aboutMenuItem;

    private MenuItem quitMenuItem;
    
    public ApplicationTrayPopupMenu() throws HeadlessException {
        super();
        applicationService = new ApplicationServiceImpl();
        initialize();
    }

    private void initialize() {
        add(getAboutMenuItem());
        addSeparator();
        add(getQuitMenuItem());
    }

    public MenuItem getAboutMenuItem() {
        if (aboutMenuItem == null) {
            aboutMenuItem = new MenuItem("About");
            aboutMenuItem.addActionListener(e -> System.out.println(applicationService.getAboutApplication()));
        }
        return aboutMenuItem;
    }

    public MenuItem getQuitMenuItem() {
        if (quitMenuItem == null) {
            quitMenuItem = new MenuItem("Quit");
            quitMenuItem.addActionListener(e -> applicationService.quitApplication());
        }
        return quitMenuItem;
    }
}
