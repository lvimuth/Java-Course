import java.util.Scanner;
public class Day09_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr [] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter "+(i+1)+" number : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Bubble sorting");
		for(int i=4;i>=0;i--) {
			for (int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int j=0;j<5;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}