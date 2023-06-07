import java.util.Scanner;
public class Day06_05{
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter the oprtation you need to perform : ");
		char op = sc.next().charAt(0);
		
		System.out.print("Enter the Second number : ");
		double num2 = sc.nextDouble();
		
		switch(op){
			case '+' : System.out.println(num1+" "+op+" "+num2+ " = "+(num1+num2)); break;
			case '-' : System.out.println(num1+" "+op+" "+num2+ " = "+(num1-num2)); break;
			case '/' : if(num2 !=0 )System.out.println(num1+" "+op+" "+num2+ " = "+(num1/num2));
						else
							System.out.println("Zero division error ");break;
			case '*' : System.out.println(num1+" "+op+" "+num2+ " = "+(num1*num2)); break;
			default: System.out.println("Wrong operation");
		}
		}
}