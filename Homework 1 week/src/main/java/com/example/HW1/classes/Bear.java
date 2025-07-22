package com.example.HW1.classes;

import com.example.HW1.interfaces.Fur;
import com.example.HW1.interfaces.Spine;

public final class Bear extends Mammal implements Fur, Spine {
    public Bear() {
        System.out.println("Bear is a mammal");
    }

    @Override
    public void fur() {
        System.out.println("Furry bear");
    }

    @Override
    public void spine() {
        System.out.println("Bear has a spine");
    }
}
