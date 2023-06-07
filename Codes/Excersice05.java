import java.util.Scanner;
public class Excersice05{
	public static void main(String args[]){
		Scanner val1 = new Scanner(System.in);
		System.out.print("Enter the Fahrenheit Temp :");
		
		double fahrenheit = val1.nextDouble();
		
		double celsius = (5.0f/9.0f)*(fahrenheit-32);
		
		System.out.println(fahrenheit+" in Celsius : "+celsius);
	}
	
}