package com.example.Proxy;

public class Main {
    public static void main(String[] args) {
        ShowData data1 = new Protecter("1", 1, true);
        data1.getData();

        ShowData data2 = new Protecter("2", 2, false);
        data2.getData();
    }
}
