import java.util.Scanner;
public class Day07_02{
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Raw : ");
		int raw = sc.nextInt();
		System.out.print("Enter the Column : ");
		int col = sc.nextInt();
		
		for (int i = 1 ; i<=raw;i++){
			for (int j = 1 ; j <= col;j++){
				System.out.print("* ");
			}
			System.out.println(); //System.out.print("\n");
		}
	}
}