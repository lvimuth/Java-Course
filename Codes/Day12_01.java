public class Day12_01{
	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		double m= 0;
		int n=a.length;
		if(n%2==1){
			m=a[(n+1)/2-1];
		}else
			m=(a[n/2-1]+a[n/2])/2;
		System.out.println("Median : "+m);
	}
}