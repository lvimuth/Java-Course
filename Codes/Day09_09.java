public class Day09_09{
	public static void main(String args[]){
		char a[] = {'A','A','A'};
		char b[] = {'B','B','B','B','B','B'};
		char ab[] = new char[a.length+b.length];
		int j=0;
		
		for(int i=0;i<2*(a.length<=b.length ?a.length:b.length);i+=2){
			ab[i]=a[j];
			ab[i+1] = b[j];
			j++;
		}
		if (a.length>b.length || b.length>a.length){
			for(int i = (a.length<=b.length ?(2*a.length):(2*b.length));i<(a.length+b.length);i++){
				ab[i] = (a.length>b.length?a:b)[j];
				j++;
			}
		}
		for (int i= 0; i<ab.length;i++){
			System.out.print(ab[i]+" ");
		}
	}
}