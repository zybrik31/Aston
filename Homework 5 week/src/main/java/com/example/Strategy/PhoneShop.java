package com.example.Strategy;

public class PhoneShop {
    private ChooseStrategy chooseStrategy;

    public void setStrategy(ChooseStrategy chooseStrategy) {
        this.chooseStrategy = chooseStrategy;
    }

    public void chooseStrategy(int cost, boolean efficiency) {
        chooseStrategy.chooseStrategy(cost, efficiency);
    }
}
