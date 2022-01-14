package filehandle;

import java.io.*;

public class WriteFile {

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("Test.txt");
            BufferedWriter br = new BufferedWriter(myWriter);
            PrintWriter pr = new PrintWriter(br);

            
            // Writes this content into the specified file
            pr.println("Object Oriented Development with Java." + "\n" + "This module is taught by RN Thakur.");
            pr.close();

            // Closing is necessary to retrieve the resources allocated
            br.close();
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
