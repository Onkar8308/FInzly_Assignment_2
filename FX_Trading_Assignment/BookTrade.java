package FX_Trading_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTrade {
	

	ArrayList<Customer_data> data = new ArrayList<>();
	Customer_data cd = new Customer_data();
	
	public void booking() {
		
		String name,currencypairs,rate;
		int amount;
		int count=0;
		double  usdinr = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name");
		name = sc.next();
		
		System.out.println("Enter currency pair");
		currencypairs = sc.next();
		
		System.out.println("Enter amount to be transfer");
		amount = sc.nextInt();
		
		System.out.println("choose the conversion system enter\n"
				+ "1: USDtNR\t"
				+ "2: INR2USD\t"
				+ "3: EUR2USD\t"
				+ "4: USD2EUR");
		
		int conversion_choice =sc.nextInt();
		Conversions con = new Conversions();
		
		switch (conversion_choice) {
			
			case 1: 
				usdinr = con.USDTOINR(amount);
				break;
			case 2:
				
				con.INRTOUSD();
				break;
				
			case 3: con.EURTOUSD();
					break;
					
			case 4:
				con.USD2EUR();
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + conversion_choice);
		}
		
		
		System.out.println("Do you want to get rate");
		rate = sc.next();
		
		if(rate.equalsIgnoreCase("yes"))		
		
			System.out.println("You are transferring " + usdinr  + " to "+ name + "( Assuming that rate was 66.00) \n");
		
		else if(rate.equalsIgnoreCase("no"))
		
			System.out.println("You are transferring " + usdinr  + " to "+ name);
		
		else
		
			System.out.println("enter given choice");
		
		System.out.println("Book or cancel this trade ");
		String choice = sc.next();
		
		if(choice.equalsIgnoreCase("book")) {
			
			//adding data to the list
			count++;
			cd.setName(name);
			cd.setCurrencypair(currencypairs);
			cd.setAmount(usdinr);
			cd.setGetrate(66);
			cd.setTradeno(count);
			

			PrintTrade.add(cd.getName(),cd.getCurrencypair(),cd.getAmount(),cd.getGetrate());
			System.out.println("Trade for "+ cd.getCurrencypair() +" has been booked with rate 66.00 , The amount of Rs "+ cd.getAmount()+" will  be transferred in 2 working days to " + cd.getName());
		
		}else if(choice.equalsIgnoreCase("cancel")) {
		
			System.out.println("Trade is cancelled");
		
		}else
		
			System.out.println("plaease enter choice mentioned above");
		
		
	}
	


}
