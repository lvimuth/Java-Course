public class Day09_04{
	public static void main(String args[]){
		int arrFirst[] = new int[5];
		int arrSecond[] = new int[5];
		int firstArray[] = {2,8,5,7,9,3,1};
		
		int maxValue=firstArray[0];
		
		for(int i = 0;i<firstArray.length;i++){
			if(maxValue<=firstArray[i]){
				maxValue = firstArray[i];
			}
		}
		System.out.println("Maximum value : "+maxValue);
		
		int minValue=firstArray[0];
		for(int i = 0;i<firstArray.length;i++){
			if(minValue>=firstArray[i]){
				minValue = firstArray[i];
			}
		}
		System.out.println("Minimum value : "+minValue);
	}
}