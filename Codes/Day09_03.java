import java.util.Scanner;

public class Day09_03{
	public static void main(String args[]){
		int arrFirst[] = new int[5];
		int arrSecond[] = new int[5];
		//int firstArray[] = {1,2,3,4,5,6};
		int a=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i= 0; i<5;i++){
			System.out.print("Enter "+(i+1)+" first number : ");
			arrFirst[i] = sc.nextInt();
		}
		System.out.println("\nSecond Array : ");
		
		for (int i= arrFirst.length-1, k = 0; i>=0 & k <=arrFirst.length-1;i--,k++){
			arrSecond[k] = arrFirst[i];
			//System.out.print(arrSecond[k]+" ");
		}
		for (int i= 0; i<5;i++)
			System.out.print(arrSecond[i]+" ");
		
	}
}