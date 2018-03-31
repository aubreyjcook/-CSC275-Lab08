import java.io.IOException;
import java.util.Scanner;

public class Lab08 {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		java.io.File file = new java.io.File("test.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		output.print("hello");
		output.close();
	}

}
