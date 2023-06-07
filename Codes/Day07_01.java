import java.util.Scanner;
public class Day07_01{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int total = 1;
		System.out.print("Enter a number : ");
		int val = sc.nextInt();
		
		if (val>0){
			for (int i = 1;i<=val;i++){
				total = total*i; //total=total*i;	
		}
		System.out.println("Factorial of "+val+" numbers : "+total);
		}
		else if (val == 0){
			System.out.println("Factorial of 0 is 1");
		}else{
			System.out.println("Invalid input ");
		}
		
		
	}
}