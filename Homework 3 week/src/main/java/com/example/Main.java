package com.example;

public class Main {
    public static void main(String[] args) {

        String filename = "Hello world.txt";
        FileIO file = new FileIO(filename);
        try {
            file.readFromFile(filename);
        }
        catch (FileIOExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            file.writeToFile(filename, "Hello World1");
            file.writeToFile(filename, "Hello World2");
        }
        catch (FileIOExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            file.readFromFile("filename.txt");
        }
        catch (FileIOExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(file.readFromFile(filename));
        }
        catch (FileIOExceptions e){
            System.out.println(e.getMessage());
        }
    }
}