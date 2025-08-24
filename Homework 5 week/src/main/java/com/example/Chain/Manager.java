package com.example.Chain;

public class Manager implements TalkWith {
    TalkWith talkWith;

    @Override
    public void next(TalkWith talkWith) {
        this.talkWith = talkWith;
    }

    @Override
    public void convWith(int value) {
        if (value == 2) { System.out.println("Сейчас решим ваш вопрос");}
        else {
            System.out.println("Соединяю с начальником");
            talkWith.convWith(value);
        }
    }
}
