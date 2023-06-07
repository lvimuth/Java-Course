//Single dimension array
import java.util.Scanner;

public class Day08_04{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int num[]= new int[4];
		int num2[]= new int[4];
		int num3[]= new int[4];
		float[] firstArray,secondArray;
		double AArray[],notAArray;
		String firstName [] = {"Kamal","Nimal","Sunil","Wimal"};
		
		
		for (int i=0;i<=3;i++){
			System.out.print("Enter number "+(i+1)+" : ");
			num[i] = sc.nextInt();
		}
		System.out.println("Entered numbers are ");
		for (int i=0;i<=3;i++){
			num2[i]=num[i];
		}
		for (int i=0;i<=3;i++){
			num3[i] = num2[i]*num[i];
		}
		for (int i=0;i<=3;i++){
			System.out.println(num[i] +" * "+ num2[i]+ " = " + num3[i]);
		}
	}
}