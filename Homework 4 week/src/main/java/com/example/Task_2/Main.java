package com.example.Task_2;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(1);

        Thread ex1 = new Thread(() -> {
            while (true) {
                if (a.get() == 1) {
                    System.out.println(a.get());
                    a.set(2);
                }
            }
        });

        Thread ex2 = new Thread(() -> {
            while (true) {
                if (a.get() == 2) {
                    System.out.println(a.get());
                    a.set(1);
                }
            }
        });

        ex1.start();
        ex2.start();
    }
}
