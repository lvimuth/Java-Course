public class Day07_04{
	public static void main(String args[]){
		
		int i=1;
		int total = 0;
		while(i<=10){
			total = total+i;
			i++;
		}
		System.out.println("Total : "+ total);
		
		i=1;
		int factorial = 1;
		while(i<=10){
			factorial = factorial*i;
			i ++;
		}
		System.out.println("Factorial : "+ factorial);
	}
}