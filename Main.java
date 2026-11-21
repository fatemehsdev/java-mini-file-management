import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
		
		FileManager myFile = new FileManager();
		
		System.out.println("Please enter the filename [text.txt] :");
		String fileName = scanner.nextLine();
		
		while(true) {
		System.out.println("-------Options------");
		System.out.println("1 : Create File");
		System.out.println("2 : Write File");
		System.out.println("3 : Read File");
		System.out.println("4 : Delete File");
		System.out.println("5 : Exit");
		System.out.println();
		System.out.println("Select options by entering the number [1-5] : ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		
		switch(number) {
		
		case 1 :
			myFile.createFile(fileName);
			break;
			
		case 2 :
			System.out.println("Please enter the text :");
			String text = scanner.nextLine();
			myFile.writeFile(fileName, text);
			break;
			
		case 3 :
			myFile.readFile(fileName);
			break;
			
		case 4 : 
			myFile.deleteFile(fileName);
			break;
			
		 case 5:
	            System.out.println("You have exited!");
	            scanner.close();
	            return;
			
			default :
				System.out.println("Invalid number entered");
			
		}
		}

    }
}