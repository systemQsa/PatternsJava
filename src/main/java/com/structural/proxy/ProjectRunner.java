package com.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project realProject = new ProxyProject("https://www.github.com/systemQsa");
        realProject.run();
    }
}
