public class Day09_05{
	public static void main(String args[]){
		int arrFirst[] = new int[5];
		int arrSecond[] = new int[5];
		int firstArray[] = {2,8,5,7,9,3,1};
		
		for(int i=0;i<firstArray.length;i++){
			for(int j = 1;j<=firstArray[i];j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}