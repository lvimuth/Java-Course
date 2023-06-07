public class Day08_02{
	public static void main(String args[]){
		
		for(int row = 0; row<=13;row++){
			if(row == 0){
				System.out.print("*\t");
			}else{
				System.out.print(row+"\t");
			}
			
			for(int col = 1; col <=13;col++){
				if (row == 0){
					System.out.print((col)*(row+1)+"\t");
				}else{
					System.out.print(col*row+"\t");
				}
				
			}
			System.out.println();
		}
	}
}