package filehandle;

import java.io.*;

public class CreateFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        // Creating an object of a file
            File myObj = new File("Test.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    
}
