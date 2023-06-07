import java.util.Scanner;
public class Day05{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		double num = sc.nextDouble();
		System.out.println("You have enterd : "+num);
		
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Your name is "+name);
		
		System.out.println("Input a character : ");
		char op = sc.next().charAt(0);
		System.out.println(op);
	}
}