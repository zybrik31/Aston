package com.example.Decorator;

abstract class ChainOfEffects implements FuncOfSound{
    protected FuncOfSound f;

    public ChainOfEffects(FuncOfSound f) {
        this.f = f;
    }

    @Override
    public void playSound() {
        f.playSound();
    }

    @Override
    public String getSoundName(){
        return f.getSoundName();
    }
}
