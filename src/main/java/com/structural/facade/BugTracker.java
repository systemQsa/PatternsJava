package com.structural.facade;

public class BugTracker {
    public boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint in not active");
        activeSprint = false;
    }
}
