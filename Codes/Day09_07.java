public class Day09_07{
	public static void main(String args[]){
		char a[] = {'A','A','A','A'};
		char b[] = {'B','B','B','B'};
		char ab[] = new char[a.length+b.length];
		
		for(int i=0,k=0;i<(a.length+b.length)& k<a.length;i+=2,k++){
			ab[i] = a[k];
			ab[i+1] = b[k];
		}
		for (int i= 0; i<ab.length;i++){
			System.out.print(ab[i]+" ");
		}
	}
}