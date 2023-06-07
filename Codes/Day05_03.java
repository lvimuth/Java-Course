import java.util.Scanner;
import java.util.*;
public class Day05_03{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int number = rnd.nextInt(10);
		
		System.out.print("Guess the number : ");
		int num = sc.nextInt();
		System.out.print("Guessed number is "+number);
		if (number==num){
			System.out.println("\nGuessing is correct");
		}else{
			System.out.println("\nGuessing is incorrect");
		}
	}
}