import java.util.Scanner;
public class Day06_01{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first subject mark : ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second subject mark : ");
		double num2 = sc.nextDouble();
		System.out.print("Enter the third subject mark : ");
		double num3 = sc.nextDouble();
		
		double avg = (num1+num2+num3)/3;
		System.out.println("Your marks avarage is : "+avg);
		
		if(0.0<avg && avg<=39.0){
			System.out.println("Fail");
		}else if (39.0<avg && avg <= 54.0){
			System.out.println("Pass");
		}else if (54.0<avg && avg<=69.0){
			System.out.println("Good");
		}else if (69.0<avg){
			System.out.println("Very Good");
		}
		
		System.out.print(0.0<avg && avg<=39.0 ? "Fail": 39.0<avg && avg <= 54.0? "Pass": 54.0<avg && avg<=69.0 ? "Good": 69.0 < avg? "Very Good": "Invalid Marks"); 
	}
}