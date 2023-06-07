import java.util.Scanner;

public class Day08_05{
	public static void main(String args[]){
		String firstName[]= new String[3];
		String secondName[] = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i= 0; i<3;i++){
			System.out.print("Enter "+(i+1)+" first name : ");
			firstName[i] = sc.nextLine();
		}
		for (int i= 0; i<3;i++){
			secondName[i] = firstName[i];
		}
		for (int i= 0; i<3;i++){
			System.out.println("Array 01 "+firstName[i]+" Array 02 "+secondName[i]);
		}
	
	}
}