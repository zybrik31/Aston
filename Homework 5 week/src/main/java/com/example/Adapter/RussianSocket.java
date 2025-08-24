package com.example.Adapter;

public class RussianSocket{
    RussianPlug russianPlug;
    ForeignSocket foreignSocket;

    public RussianSocket(RussianPlug russianPlug) {
        this.russianPlug = russianPlug;
    }

    public RussianSocket(ForeignSocket foreignSocket) {
        this.foreignSocket = foreignSocket;
    }

    public void power(){
        System.out.println("Подаем электричество через РФ сокет");
    }
}
