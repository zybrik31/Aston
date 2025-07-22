package com.example.HW1.classes;

import com.example.HW1.interfaces.Spine;
import com.example.HW1.interfaces.Water;

public final class Whale extends Mammal implements Spine, Water {
    public Whale() {
        System.out.println("Whale is a mammal");
    }

    @Override
    public void spine() {
        System.out.println("Whale has a spine");
    }

    @Override
    public void water() {
        System.out.println("All whales live in water!");
    }
}
