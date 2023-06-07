import java.util.Scanner;
public class Day10_01{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arrFirst[][] = new int[4][4];
		int total = 0;
		for(int i =0; i <4;i++){
			for (int j =0;j<4;j++){
				System.out.print("Enter "+(i+1)+" row "+(j+1)+" column number : ");
				arrFirst[i][j] = sc.nextInt();
				total = total+arrFirst[i][j];
			}
		}
		System.out.println("\nTotal of your Array : "+ total);
		System.out.println("\nYour Array : ");
		for(int i =0; i <4;i++){
			for (int j =0;j<4;j++)
				System.out.print(arrFirst[i][j]+" ");
			
			System.out.println();
		}
		System.out.println("Main diagonal of the Array is : ");
		for(int i =0; i <4;i++){
			for (int j =0;j<4;j++){
				if(i == j)
					System.out.print(arrFirst[i][j]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i =0; i <4;i++){
			for (int j =0;j<4;j++)
				arrFirst[i][j] = arrFirst[i][j] * 7;
		}
		System.out.println("Array multiply by 07 :  ");
		for(int i =0; i <4;i++){
			for (int j =0;j<4;j++)
				System.out.print(arrFirst[i][j]+"  ");
			
			System.out.println();
		}
		
		System.out.println("Diagonals of the Array are : ");
		for(int i =0; i <4;i++){
			for (int j =0;j<4;j++){
				if(i == j | i+j == 3)
					System.out.print(arrFirst[i][j]+" ");
				else
					System.out.print("*  ");
			}
			System.out.println();
		}
	}
}