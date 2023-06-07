import java.util.Scanner;
public class Excersice04_Miles{
	public static void main(String args[]){
		Scanner val1 = new Scanner(System.in);
		Scanner val2 = new Scanner(System.in);
		
		System.out.print("Enter the miles : ");
		int miles = val1.nextInt();
		
		System.out.print("Enter the yards : ");
		int yards = val2.nextInt();
		
		double miles_in_km = (double)(miles) * 1.609;
		System.out.println(miles+" in Kilo Meters :"+miles_in_km+"km");
		
		double yards_in_km = (double)(yards) * 1.609;
		System.out.println(yards+" in Kilo Meters :"+yards_in_km+"km");
	}
	
}