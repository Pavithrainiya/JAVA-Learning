package Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Training {
    public static void main(String[] args) {
        // Specify the file path
        File myFile = new File("KSRCT.txt");

        try {
            // Create FileWriter object to write to the file
            FileWriter fileWriter = new FileWriter(myFile);
            
            // Write some content to the file
            fileWriter.write("This is having an information of the students\n");
            fileWriter.write("Name: Pavithra, age: 21\n");
            fileWriter.write("Name: Ramya, age: 21\n");
            fileWriter.close(); // Close the FileWriter
            
            // Check if the file was created
            if (myFile.exists()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File creation failed.");
            }
        } catch (IOException e) {
            // Print the error message and stack trace
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}