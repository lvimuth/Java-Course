public class Day07_03{
	public static void main(String args[]){
		for (int i = 1 ; i<=7;i++){
			for (int j = i ; j <= 7;j++){
				System.out.print("* ");
			}
			System.out.println(); //System.out.print("\n");
		}
		
		for (int i = 1 ; i<=7;i++){
			for (int j = 1 ; j <= 7;j++){
				if(i==j)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println(); //System.out.print("\n");
		}
		
		for (int i = 1 ; i<=7;i++){
			for (int j = 1 ; j <= 7;j++){
				if(i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(); //System.out.print("\n");
		}
		
		for (int i = 1 ; i<=7;i++){
			for (int j = 1 ; j <= 7;j++){
				if(i<j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(); //System.out.print("\n");
		}
		
		for (int i = 1 ; i<=7;i++){
			for (int j = 1 ; j <= 7;j++){
				if(i>j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(); //System.out.print("\n");
		}
		System.out.println();
		for (int i = 7 ; i>=1;i--){
			for (int j = 1 ; j <= 7;j++){
				if(i==j)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println(); //System.out.print("\n");
		}
	}
}