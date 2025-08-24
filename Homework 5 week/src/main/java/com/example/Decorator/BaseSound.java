package com.example.Decorator;

import javax.swing.*;

public class BaseSound implements FuncOfSound{
    private String name;

    public BaseSound(String name) {
        this.name = name;
    }

    public void playSound() {
        System.out.println(this.name);
    }

    public String getSoundName() {
        return this.name;
    }
}
