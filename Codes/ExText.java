public class ExText{
	public static void main(String args[]){
		int x=2,y=7;
		
		//Assignment

		System.out.println(--x + y++ + x++);
		
		int z=5;
		y=7;
		System.out.println("Result is "+y*z);
		System.out.println("Result is "+y+z);
		System.out.println("Result is "+(y+z));
		System.out.println(y+z+" is the Result");
		// System.out.println("Result is "+y-z);  //getting error
		System.out.println("Result is "+(y-z));
		
		
		System.out.println(x<y); //Condition
		System.out.println(x==y);
		
		System.out.println((x<y)&&(y<z));  //bitwise operation
		System.out.println((x<y)||(y<z));
		System.out.println(!(x<y)&&(y<z));
		System.out.println(x&y); //logical operation
		System.out.println(Integer.toBinaryString(x&y)); //logical operation
		
		System.out.println((x<y)&(y<z));
		}
	}