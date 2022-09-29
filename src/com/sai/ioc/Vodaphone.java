package com.sai.ioc;

public class Vodaphone implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from com.sai.ioc.Vodaphone");
    }

    @Override
    public void data() {

        System.out.println("Data from com.sai.ioc.Vodaphone");
    }
}
