import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public void createFile(String fileName) {

        try {
            File newFile = new File(fileName);
            if (newFile.createNewFile()) {
                System.out.println("File created : " + newFile.getName());
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println("Could not create the file: " + e.getMessage());
        }
    }

    public void writeFile(String fileName, String text) {

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text + System.lineSeparator());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Could not write to the file: " + e.getMessage());
        }
    }

    public void readFile(String fileName) {

        File newFile = new File(fileName);
        try (Scanner myReader = new Scanner(newFile)) {
            if (!myReader.hasNextLine()) {
                System.out.println("The file is empty.");
                return;
            }
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
        } catch (FileNotFoundException e) {
           System.out.println("File not found: " + fileName + " (use option 1 to create it)");
        }

    }

    public void deleteFile(String fileName) {

        File newFile = new File(fileName);
        if (!newFile.exists()) {
            System.out.println("File not found: " + fileName);
        } else if (newFile.delete()) {
            System.out.println("File deleted : " + newFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

}