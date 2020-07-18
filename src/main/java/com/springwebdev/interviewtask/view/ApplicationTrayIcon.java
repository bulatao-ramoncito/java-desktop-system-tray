package com.springwebdev.interviewtask.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ApplicationTrayIcon extends TrayIcon {

    private final ApplicationTrayPopupMenu popupMenu;

    private final  ApplicationFrame  frame;

    public ApplicationTrayIcon(Image image) {
        super(image);
        popupMenu = new ApplicationTrayPopupMenu();
        frame = new ApplicationFrame();
        initialize();
    }

    private void initialize() {
        setPopupMenu(popupMenu);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (SwingUtilities.isLeftMouseButton(e))  {
                    frame.setVisible(true);
                    frame.setLocation(e.getXOnScreen() ,e.getYOnScreen() - frame.getHeight());
                }
            }
        });
    }
}
