import java.util.Scanner;
public class Day06_06{
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the your First name :");
		
		String str= sc.next();
		
		switch(str){
			case "lakshitha": System.out.println("Colombo"); break; 
			case "vimuth": System.out.println("Homagama"); break; 
			case "senarathna": System.out.println("Kottawa"); break; 
			default : System.out.println("Error");
		}
	}
}