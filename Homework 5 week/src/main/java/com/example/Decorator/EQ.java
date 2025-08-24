package com.example.Decorator;

public class EQ extends ChainOfEffects{

    public EQ(FuncOfSound f) {
        super(f);
    }

    @Override
    public void playSound() {
        super.playSound();
        System.out.println("Эквализируем");
    }

    @Override
    public String getSoundName() {
        return super.getSoundName() + " + эквалайзер";
    }
}
