package com.basicspring.ioc;

public class Jio implements Sim {

    @Override
    public void calling() {
        System.out.println("Calling using Jio");
    }

    @Override
    public void data() {
        System.out.println("Data Browsing using Jio");
    }
}
