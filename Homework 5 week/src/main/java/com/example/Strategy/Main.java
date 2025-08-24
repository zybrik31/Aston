package com.example.Strategy;

public class Main {
    public static void main(String[] args) {
        PhoneShop phoneShop = new PhoneShop();

        phoneShop.setStrategy(new Fast());
        phoneShop.chooseStrategy(325, true);

        phoneShop.setStrategy(new Medium());
        phoneShop.chooseStrategy(150, false);

        phoneShop.setStrategy(new Slow());
        phoneShop.chooseStrategy(50, false);

    }
}
