package com.example.Adapter;

public class SocketAdapter implements Plug{
    private ForeignSocket foreignSocket;

    public SocketAdapter(ForeignSocket foreignSocket) {
        this.foreignSocket = foreignSocket;
    }

    public void plugIn(){
        System.out.println("Подключаем адаптер");
        foreignSocket.power();
        System.out.println("Все работает");
    }
}
