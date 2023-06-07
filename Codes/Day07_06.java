import java.util.Scanner;

public class Day07_06{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\tWelcome");
		System.out.print("First good name : ");
		String good1 = sc.nextLine();
		System.out.print("Second good name : ");
		String good2 = sc.nextLine();
		System.out.print("Third good name : ");
		String good3 = sc.nextLine();
		
		System.out.print(good1+" price : ");
		double good1Price = sc.nextDouble();
		System.out.print(good2+" price : ");
		double good2Price = sc.nextDouble();
		System.out.print(good3+" price : ");
		double good3Price = sc.nextDouble();
		
		System.out.println("********************************");
		
		int good1Amount= 1000,good2Amount= 1000,good3Amount = 1000;
		//int updated1Amount,updated2Amount,updated3Amount;
		
		char nextCustomer = 'y';
		int good1Customer,good2Customer,good3Customer;
		double good1total=0,good2total=0,good3total=0;
		int noOfcustomers = 0;
		while(nextCustomer == 'y'){
			boolean neg = true;
			boolean neg1 = true,neg2=true,neg3=true;
			while(neg == true){
				System.out.print(good1+" amount : ");
				good1Customer = sc.nextInt();
				if (good1Customer >= 0 & good1Customer<= good1Amount){
					good1Amount = good1Amount-good1Customer;
					good1total=good1Price*good1Customer;
					neg = false;
				}else if(good1Customer>= good1Amount) {
					System.out.println("No sufficent amount of goods in "+good1);
					neg = true;
				}else{
					System.out.println("Invalid amount!");
					neg = true;
				}
			}
			
			while(neg2 == true){
				System.out.print(good2+" amount : ");
				good2Customer = sc.nextInt();
				if (good2Customer >= 0 & good2Customer<= good2Amount){
					good2Amount = good2Amount-good2Customer;
					good2total=good2Price*good2Customer;
					neg2 = false;
				}else if(good2Customer>= good2Amount) {
					System.out.println("No sufficent amount of goods in "+good2);
					neg2 = true;
				}else{
					System.out.println("Invalid amount!");
					neg2 = true;
				}
			}
			
			while(neg3 == true){
				System.out.print(good3+" amount : ");
				good3Customer = sc.nextInt();
				if (good3Customer >= 0 & good3Customer<= good3Amount){
					good3Amount = good3Amount-good3Customer;
					good3total=good3Price*good3Customer;
					neg3 = false;
				}else if(good3Customer>= good3Amount) {
					System.out.println("No sufficent amount of goods in "+good3);
					neg3 = true;
				}else{
					System.out.println("Invalid amount!");
					neg3 = true;
				}
			}
			
			double totalAmount = good1total+good2total+good3total;
			
			System.out.println("Total Amount to pay : "+totalAmount);
			while(neg1==true){
				System.out.print("Pay amount : ");
				double payAmount = sc.nextDouble();
				
				if (payAmount<0){
					System.out.println("Invalid pay amount!");
					neg1 = true;
				}else if (payAmount<=totalAmount){
					System.out.println("Need more money!");
					neg1 = true;
				}else{
					double balance = payAmount-totalAmount;
					System.out.println("Balance : " +balance );
					neg1 = false;
				}
			}
			System.out.print("Do you have another customer (y/n) : ");
			nextCustomer = sc.next().charAt(0);
			noOfcustomers++;
		}
		System.out.println("You have " +noOfcustomers+" customers");
	}
}