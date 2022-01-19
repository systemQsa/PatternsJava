package com.structural.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJod();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);

    }
}
