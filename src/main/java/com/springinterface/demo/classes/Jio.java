package com.springinterface.demo.classes;

import com.springinterface.demo.Interface.Sim;

public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling using Jio sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing using Jio sim");
    }
    
}
