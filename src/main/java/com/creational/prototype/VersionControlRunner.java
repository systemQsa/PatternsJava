package com.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"super project","SourceCode source = new SourceCode()");

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}
