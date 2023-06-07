public class Day05_01{
	public static void main(String args[]){
	int a =3;
	a|=6;//a|=6;
	System.out.println(a);
	System.out.println(Integer.toBinaryString(a));
	
	a = a>>1;
	System.out.println(a);
	System.out.println(Integer.toBinaryString(a));
	
	int b=7;
	System.out.println(~b);
	System.out.println(Integer.toBinaryString(~b));
	
	System.out.println("************************************");
	
	a=-1;
	System.out.println(a);
	System.out.println(Integer.toBinaryString(a));
	a>>>=1;
	System.out.println(a);
	System.out.println(Integer.toBinaryString(a));
	
	System.out.println("************************************");
	
	a=1,b=2;
	//Ternaty if then else operator
	
	}
}