package com.example.HW2.classes;

import com.example.HW2.abstract_class.Transport;
import com.example.HW2.interfaces.Cargo;
import com.example.HW2.interfaces.Screw;
import com.example.HW2.interfaces.Wheels;
import com.example.HW2.interfaces.Wings;

public final class Plain extends Transport implements Wheels, Screw, Wings, Cargo {
    public Plain() {
        super();
        System.out.println("Plain is a part of transport");
    }

    @Override
    public void cargo() {
        System.out.println("Plain carries cargo");
    }

    @Override
    public void screw() {
        System.out.println("Plain has a screw");
    }

    @Override
    public void wheels() {
        System.out.println("Plain has wheels");
    }

    @Override
    public void wings() {
        System.out.println("Plain has wings");
    }
}
