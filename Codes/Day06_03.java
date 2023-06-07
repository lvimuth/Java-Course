import java.util.Scanner;
public class Day06_03{
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a month as a number : ");
		
		int month = sc.nextInt();
		
		System.out.println((month == 1 | month == 2 | month ==12)? "Season is WInter":(month>=3 & month <=5)? "Season is Spring":(
		month >= 6 & month <= 8)? "Season is Summer":(month >=9& month <= 11)? "Season is Autumn": "Bogus month");
	}
}