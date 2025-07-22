package com.example.HW2.classes;

import com.example.HW2.abstract_class.Transport;
import com.example.HW2.interfaces.Cargo;
import com.example.HW2.interfaces.Screw;

public final class Tanker extends Transport implements Screw, Cargo {
    public Tanker() {
        super();
        System.out.println("Tanker is a part of transport");
    }

    @Override
    public void cargo() {
        System.out.println("Tanker carries cargo");
    }

    @Override
    public void screw() {
        System.out.println("Tanker has a screw");
    }
}
