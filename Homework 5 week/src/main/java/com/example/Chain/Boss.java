package com.example.Chain;

public class Boss implements TalkWith{
    TalkWith talkWith;

    @Override
    public void next(TalkWith talkWith) {
        this.talkWith = talkWith;
    }

    @Override
    public void convWith(int value) {
        if (value == 3) { System.out.println("Конечно, сейчас все решим");}
        else {
            System.out.println("Соединяю с директором");
            talkWith.convWith(value);
        }
    }
}
