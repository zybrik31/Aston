package com.example.Decorator;

public class Compressor extends ChainOfEffects{

    public Compressor(FuncOfSound f) {
        super(f);
    }

    @Override
    public void playSound() {
        super.playSound();
        System.out.println("Добавляем компрессор");
    }

    @Override
    public String getSoundName() {
        return super.getSoundName() + " + компрессор";
    }
}
