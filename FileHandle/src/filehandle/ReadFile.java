package filehandle;

import java.io.*;

import java.util.Scanner;


public class ReadFile {
    public static void main(String args[]){
        try {
            // Creating an object of the file for reading the data
            File myObj = new File("Test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
