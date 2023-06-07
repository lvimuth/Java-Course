public class Day08_01{
	public static void main(String args[]){
		
		for(int row = 0; row<=7;row++){
			for(int col = 0; col <=7;col++){
				if (col+row == 7){
					System.out.print("* ");
				}else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}