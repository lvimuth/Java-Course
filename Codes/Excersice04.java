import java.util.Scanner; 
public class Excersice04{
	public static void main(String args[]){
		Scanner radius = new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
		double rad = radius.nextFloat();
		
		double area = 3.14*rad*rad;
		System.out.print(area);
	}
}