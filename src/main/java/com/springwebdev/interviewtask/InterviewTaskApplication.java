package com.springwebdev.interviewtask;

import com.springwebdev.interviewtask.view.ApplicationTrayIcon;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.awt.*;

@SpringBootApplication
public class InterviewTaskApplication {

	public static void main(String[] args) {
		 new SpringApplicationBuilder(InterviewTaskApplication.class)
				 .headless(false)
				 .run(args);
	}

	public InterviewTaskApplication() {
		if (SystemTray.isSupported()) initApplication();
	}

	private void initApplication() {
		ApplicationTrayIcon trayIcon = new ApplicationTrayIcon(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\src\\main\\resources\\bulb.gif"));
		SystemTray tray = SystemTray.getSystemTray();
		try {
			tray.add(trayIcon);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
