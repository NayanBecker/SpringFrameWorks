package com.springinterface.demo.classes;

import com.springinterface.demo.Interface.Sim;

public class Mobile {
    
    public static void main(String[] args) {
        Sim sim = new Jio();

        sim.calling();
        sim.data();
    }
}
