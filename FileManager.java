import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public void createFile(String fileName) {
		
		try {
			File newFile = new File(fileName);
			if(newFile.createNewFile()) {
				System.out.println("File created : "+ newFile.getName());
			}else {
				System.out.println("File already exists!");
			}
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
	
	public void writeFile(String fileName,String text){
		
		try(FileWriter newFile = new FileWriter(fileName,true)){
			newFile.write(text);
			System.out.println("Successfully wrote to the file.");
		}catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
	
	public void readFile(String fileName) {
		
		File newFile = new File(fileName);
		try(Scanner myReader = new Scanner(newFile)){
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
		     System.out.println("An error occurred");
		     e.printStackTrace();
		}
		
	}
	
	public void deleteFile(String fileName) {
		
		File newFile = new File(fileName);
		if(newFile.delete()) {
			System.out.println("File deleted : "+ newFile.getName());
		}else {
			System.out.println("Failed to delete");
		}
	}
    
}