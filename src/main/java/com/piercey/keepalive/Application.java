package com.piercey.keepalive;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Application {
    public static void main(String[] args) {
        final Point lastLocation = MouseInfo.getPointerInfo().getLocation();

        final TimerTask wobbleMouse = new TimerTask() {
            public void run() {
                try {
                    final Point location = MouseInfo.getPointerInfo().getLocation();

                    if (location.equals(lastLocation)) { // implies the system may be idle... so wobble the mouse cursor...
                        final int x = (int) location.getX();
                        final int y = (int) location.getY();

                        final Robot robot = new Robot();
                        robot.mouseMove(x + 1, y);
                        robot.mouseMove(x, y);

                    } else {
                        lastLocation.setLocation(location);
                    }

                } catch (AWTException e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        };

        final Timer timer = new Timer("keepalive", false);
        timer.schedule(wobbleMouse, 1000L, 1000L);
    }
}
