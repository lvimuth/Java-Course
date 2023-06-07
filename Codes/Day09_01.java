import java.util.Scanner;

public class Day09_01{
	public static void main(String args[]){
		int arr[] = new int[5];
		int even[] = new int[5];
		int odd[] = new int[5];
		int a=0,b=0;
		Scanner sc = new Scanner(System.in);
		
		for (int i= 0; i<5;i++){
			System.out.print("Enter "+(i+1)+" first number : ");
			arr[i] = sc.nextInt();
		}
		for (int i= 0; i<5;i++){
			if(arr[i]%2==0){
				even[a] = arr[i];
				a++;
			}else{
				odd[b] = arr[i];
				b++;
			}
		}
		System.out.println("Even numbers are : ");
		for(int i=0;i<a;i++){
			System.out.print(even[i]+" ");
		}
		System.out.println("\nOdd numbers are : ");
		for(int i=0;i<b;i++){
			System.out.print(odd[i]+" ");
		}
	
	}
}