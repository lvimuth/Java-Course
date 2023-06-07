import java.util.Scanner;

public class Day11_01 {
	public static void main(String []args) {
		int num, i, j, temp;
		Scanner input = new Scanner(System.in);
	 
		System.out.print("Enter the number of integers to sort:");
		num = input.nextInt();
	 
		int array[] = new int[num];
		for (i = 0; i < num; i++) {
			System.out.print("Enter " + (i+1) + " integers: ");
			array[i] = input.nextInt();
			}
	 
		for (i = 0; i < ( num - 1 ); i++) {
			for (j = 0; j < num - i - 1; j++) {
				if (array[j] > array[j+1]){
				   temp = array[j];
				   array[j] = array[j+1];
				   array[j+1] = temp;
				}
			}
		}
	 
		System.out.println("Sorted list of integers:");
	 
		for (i = 0; i < num; i++) 
			System.out.print(array[i]+ " ");
	}
}