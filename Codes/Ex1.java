import java.util.Scanner;

public class Ex1{
	public static void main(String args[]){
		byte myByte = 3; // type 
		int result = myByte*2;
		
		System.out.println("Byte value is "+result);
		
		long num = 2587965842541L; //L is a flag, because if we remove the L it getting error
		long result_new = num*2;
		
		System.out.println("Long value is "+num);
		System.out.println("Result value is "+result_new+" when "+num+" multiply by 2");
		
		float a = 78.4f; // same as earlier, defaultly it take the variable as double so we need to add a flag "f"
		System.out.println("Float number : "+a);
		
		double b = 78.4;
		double doub = 6.0124e+23;
		System.out.println("Double number : "+b+" and this is also "+doub);
		
		/*
		int a=0xAABC ; //Hexadecimal number base 16
		int b = 023; // Octal number
		int c = 0B01010110; //Binary number 2
		
		System.out.println("Hexadecimal "+a+" Decimal number for 023 in octal: "+b);*/
		
		
		int a1 = 10;
		float b1 = 45.2f;
		
		int result1 = (int)(a1+b1); // Variable casting
		System.out.println(result1);
		
		char cha = 'A';
		int ch = 'A';
		System.out.println("For the "+cha+" in ASCII value is "+ch+" and mathematical calculation for char A "+(ch+4));
		
		//Escape sequences 
		System.out.println("Mr. President says \" I will do it \" ");
		System.out.println("When we need to add backslash \\ here is the forward /");
		
		System.out.println("Sri \nLanka  Sri \tLanka Sri\b Lanka ");
		
		String name = "Sri Lanka";
		System.out.println(name);
		
		boolean flag = false;
		System.out.println(flag);
		
		//version 01
		int radius = 4; //hard coding
		float pi = 3.14f;
		System.out.println(pi*(radius*radius));
		
		//Version 02
		float result2 = pi*(radius*radius);
		System.out.println("result is "+result2);
		
		//Version 03 -- getting input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the radius : ");
		int radius1 = sc.nextInt(); 
		pi = 3.14f;
		System.out.println(pi*(radius1*radius1));
		
		//Version 04
		Scanner val = new Scanner(System.in);
		System.out.print("Input the radius : ");
		int radius2 = val.nextInt(); 
		pi = 3.14f;
		pi = 100.2f;
		System.out.println(pi*(radius2*radius2));
		
		//Version 05 -- Constant in java
		Scanner val1 = new Scanner(System.in);
		System.out.print("Input the radius : ");
		int radius3 = val1.nextInt(); 
		final float pi1 = 3.14f;
		System.out.println(pi1*(radius3*radius3));
		
		//Version 06
		Scanner val2 = new Scanner(System.in);
		System.out.print("Input the radius : ");
		int radius4 = val2.nextInt(); 
		double result4 =  pi1*(radius4*radius4);
		System.out.println(result4);
	}
}