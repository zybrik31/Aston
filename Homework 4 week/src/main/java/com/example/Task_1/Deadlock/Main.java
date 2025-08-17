package com.example.Task_1.Deadlock;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (DeadLock_ex.num1) {
                System.out.println("Поток 1, должен быть объект 1. Ответ: " + DeadLock_ex.num1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Поток 1 должен захватить объект 2. Ждем!");
                synchronized (DeadLock_ex.num2) {
                    System.out.println("Поток 1, должен быть объект 2. Ответ: " + DeadLock_ex.num2);
                }
            }
            });
        Thread thread2 = new Thread(() -> {
            synchronized (DeadLock_ex.num2) {
                System.out.println("Поток 2, должен быть объект 2. Ответ: " + DeadLock_ex.num2);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Поток 2 должен захватить объект 1. Ждем!");
                synchronized (DeadLock_ex.num1) {
                    System.out.println("Поток 2, должен быть объект 1. Ответ: " + DeadLock_ex.num1);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
