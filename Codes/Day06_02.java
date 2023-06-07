import java.util.Scanner;
public class Day06_02{
	public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the character : ");
		
		char ch = sc.next().charAt(0);
		
		System.out.println((ch>= 'A' & ch<='Z')? "Capital letter ": (ch>= 'a' & ch<='z')?"Simple letter ":(ch>='0' & ch <='9')? "Number ":"Other");
	}
}