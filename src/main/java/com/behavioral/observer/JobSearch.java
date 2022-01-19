package com.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("first java position");
        jobSite.addVacancy("second java position");

        Observer firstSubscriber = new Subscriber("Name");
        Observer secondSubscriber = new Subscriber("Another name");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("third java position");

        jobSite.removeVacancy("first java position");


    }
}
