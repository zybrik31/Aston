package com.example;

import java.io.*;

public class FileIO {

    private String fileName;
    public FileIO(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String readFromFile(String fileName) throws FileIOExceptions {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String stringToRead;
            int i = 1;
            while ((stringToRead = reader.readLine()) != null){
                text.append(i + ". " + stringToRead).append(System.lineSeparator());
                ++i;
            }
            return text.toString();
        }
        catch (IOException e) {
            throw new FileIOExceptions("Не существует файла с именем: " + fileName, e.getCause());
        }
    }

    public void writeToFile(String fileName, String stringToWrite) throws FileIOExceptions{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(stringToWrite);
            writer.newLine();
            System.out.println("Строка \"" + stringToWrite + "\" успешно записана в файл");
            writer.close();
        }
        catch (IOException e){
            throw new FileIOExceptions("Произошла ошибка " + e.getMessage(), e.getCause());
        }
    }
}
