package com.piercey.keepalive;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Application {
    public static void main(String[] args) throws Exception {
        final Point previousLocation = MouseInfo.getPointerInfo().getLocation();
        final Point currentLocation = MouseInfo.getPointerInfo().getLocation();
        final Robot robot = new Robot();
        final long delay = 120000L;

        final TimerTask wobbleMouse = new TimerTask() {
            public void run() {
                currentLocation.setLocation(MouseInfo.getPointerInfo().getLocation());
                if (previousLocation.equals(currentLocation)) {
                    final int x = (int) currentLocation.getX();
                    final int y = (int) currentLocation.getY();
                    robot.mouseMove(x + 1, y);
                    robot.mouseMove(x, y);
                } else {
                    previousLocation.setLocation(currentLocation);
                }
            }
        };

        final Timer timer = new Timer("wobbler", false);
        timer.schedule(wobbleMouse, delay, delay);
    }
}