package com.example.Adapter;

public class Main {
    public static void main(String[] args) {
        RussianPlug russianPlug = new RussianPlug();
        RussianSocket russianSocket = new RussianSocket(russianPlug);
        ForeignSocket foreignSocket = new ForeignSocket();

        russianSocket.power();
        russianPlug.plugIn();

        foreignSocket.power();
        Plug adapter = new SocketAdapter(foreignSocket);
        adapter.plugIn();
    }
}
