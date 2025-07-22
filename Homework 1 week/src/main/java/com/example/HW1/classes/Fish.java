package com.example.HW1.classes;

import com.example.HW1.abstract_classes.Animal;
import com.example.HW1.interfaces.Water;

public final class Fish extends Animal implements Water {
    public Fish() {
        super();
        System.out.println("Fish is an animal");
    }

    @Override
    public void water() {
        System.out.println("All fishes live in water!");
    }
}
