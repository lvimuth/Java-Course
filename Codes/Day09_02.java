import java.util.Scanner;

public class Day09_02{
	public static void main(String args[]){
		int arr[] = new int[5];
		int firstArray[] = {1,2,3,4,5,6};
		int total=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i= 0; i<5;i++){
			System.out.print("Enter "+(i+1)+" first number : ");
			arr[i] = sc.nextInt();
			total+=arr[i];
		}
		for (int i= 0; i<firstArray.length;i++){
			System.out.print(firstArray[i]+" ");
		}
		System.out.println("\nTotal sum of the entered numbers : "+ total);
	}
}