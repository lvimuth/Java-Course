public class Day10_02{
	public static void main(String args[]){
	int ar[][] = {{1,1,1},
					{2,2,2,2},
						{3},
							{4,4}};	
	System.out.println("Main diagonal of the Array is : ");
		for(int i =0; i <ar.length;i++){
			for (int j =0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}