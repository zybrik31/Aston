package com.example.Chain;

public class CEO implements TalkWith{
    TalkWith talkWith;

    @Override
    public void next(TalkWith talkWith) {
        this.talkWith = talkWith;
    }

    @Override
    public void convWith(int value) {
        if (value == 4) { System.out.println("Сейчас все подпишу");}
        else {
            System.out.println("Выше меня никого нет, так что извините");
        }
    }
}
