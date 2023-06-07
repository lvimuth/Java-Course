import java.util.Scanner; // Import the Scanner class

public class User_input{
	public static void main (String args[]){
		Scanner str = new Scanner(System.in); // Create a Scanner object
		System.out.print("Enter your name : ");
		
		String name = str.nextLine(); // Read user input
		System.out.print("User name is "+name);  // Output user input
		
		
	}
	
}