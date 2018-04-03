import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab08 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("data.txt");
		while (true) {
			// Give the user a list of their options
			System.out.println("1: Create a new file using new data.");
			System.out.println("2: Load previously created file.");
			System.out.println("3: Erase previously created file.");
			System.out.println("0: Exit.");

			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			
			switch (userChoice) {
				case 1:
					createFile(file);
					break;
				case 2:
					loadFile(file);
					break;
				case 3:
					eraseFile(file);
					break;
				case 0:
					System.out.println("Closing.");
					System.exit(0);
				default:
					System.out.println("Invalid value. Choose a number 0-5 only.");
					break;
			}
		}
	}
	
	public static void createFile(File file) {
		try(
				java.io.PrintWriter output = new java.io.PrintWriter(file);
			) {
				String userInput;
				String question = null;
				for(int i = 1; i < 9; i++) {
					switch (i) {
						case 1:
							question = "What is your name? ";
							break;
						case 2:
							question = "What is your gender? ";
							break;
						case 3:
							question = "What is your age? ";
							break;
						case 4:
							question = "What is your weight? ";
							break;
						case 5:
							question = "What kind of car do you drive? ";
							break;
						case 6:
							question = "Did you graduate highschool? ";
							break;
						case 7:
							question = "Are you married? ";
							break;
						case 8:
							question = "Do you believe in Santa Claus? ";
							break;
					}
					System.out.println(question);
					userInput = input.nextLine();
					output.print(question);
					output.print(userInput);
					output.println();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	
	public static void loadFile(File file) throws FileNotFoundException {
		if(file.exists()) {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				String data = input.nextLine();
				System.out.println(data);
			}
			input.close();
		} else {
			System.out.println("No file to load.");
		}
	}
	
	public static void eraseFile(File file) {
		if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
	}
}
