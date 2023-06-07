public class Day09_08{
	public static void main(String args[]){
		
		int ar[][]=new int[3][4];
		for(int row = 0;row<=2;row++){
			for(int col = 0;col<=3;col++){
				ar[row][col]=row;
			}
		}
		for(int row = 0;row<=2;row++){
			for(int col = 0;col<=3;col++){
				System.out.print(ar[row][col]+" ");
			}
			System.out.println();
		}
	}
}