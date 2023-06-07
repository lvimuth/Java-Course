import java.util.Scanner;
public class Day10_03{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in Array A : ");
		int ar1 = sc.nextInt();
		System.out.print("Enter the number of elements in Array B : ");
		int ar2 = sc.nextInt();
		
		char a[] = new char[ar1];
		char b[] = new char[ar2];
		char ab[] = new char[a.length+b.length];
		int j=0;
		
		for(int i = 0;i<ar1;i++){
			a[i] = 'A';
		}
		for(int i = 0;i<ar2;i++){
			b[i] = 'B';
		}
		
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