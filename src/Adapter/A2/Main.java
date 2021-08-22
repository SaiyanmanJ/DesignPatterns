package Adapter.A2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            f.readFromFile("file.txt");
            f.setValue("year", "2021");
            f.setValue("month", "8");
            f.setValue("day", "22");
            f.writeToFile("newfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
