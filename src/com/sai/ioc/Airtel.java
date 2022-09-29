package com.sai.ioc;

public class Airtel implements Sim {
    public Airtel() {
        System.out.println("Contructor called");
    }

    @Override
    public void calling() {
        System.out.println("Calling from com.sai.ioc.Airtel");
    }

    @Override
    public void data() {

        System.out.println("Data from com.sai.ioc.Airtel");
    }
}
