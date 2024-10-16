package Exception;
import java.io.File;
import java.io.IOException;

public class Training {
    public static void main(String[] args) {
        try {
            // Specify the directory and file path
            File dir = new File("myDirectory");
            if (!dir.exists()) {
                dir.mkdir(); // Create the directory if it does not exist
            }

            File myFile = new File(dir, "KSRCT.txt");
            System.out.println("Attempting to create file at: " + myFile.getAbsolutePath());
            
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}