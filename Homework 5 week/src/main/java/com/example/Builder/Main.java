package com.example.Builder;

public class Main {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        Example<Integer> intBuild = new Example.BuilderEx<Integer>("Числа")
                .append(43)
                .append(846)
                .build();
        intBuild.getName();
        intBuild.getData();
        intBuild.append(7365);
        intBuild.getData();


        Example<String> strBuild = new Example.BuilderEx<String>("Строки")
                .append("Добавил")
                .append("пару")
                .append("слов")
                .build();
        strBuild.getName();
        strBuild.getData();
    }
}
