package com.example.Chain;

public class Bot implements TalkWith {
    TalkWith talkWith;

    @Override
    public void next(TalkWith talkWith) {
        this.talkWith = talkWith;
    }

    @Override
    public void convWith(int value) {
        if (value == 1){ System.out.println("Я вам помогу");}
        else {
            System.out.println("Соединяю с оператором");
            talkWith.convWith(value);
        }
    }
}
