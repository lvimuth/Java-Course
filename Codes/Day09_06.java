public class Day09_06{
	public static void main(String args[]){
		int arrFirst[] = new int[5];
		int arrSecond[] = new int[5];
		int firstArray[] = {2,8,5,7,9,3,1,4};
		int total = 0;
		
		for(int i=0;i<firstArray.length;i++){
			total+= firstArray[i];
		}
		//System.out.println(total+" / "+firstArray.length );
		float avarage = (total/firstArray.length);
		System.out.println("Avarage : "+avarage);
	}
}