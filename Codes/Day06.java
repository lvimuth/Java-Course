//Using Ternary (three way) if-else operator. (expression ? statement1 : statement2)

import java.util.Scanner;
public class Day06{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number : ");
		double num2 = sc.nextDouble();
		System.out.print("Enter the thirs number : ");
		double num3 = sc.nextDouble();
		
		System.out.print(num1>num2 && num1>num3 ? num1+" is bigger ": num2>num3? num2+ " is bigger":num3+" is bigger"); 
	}
}