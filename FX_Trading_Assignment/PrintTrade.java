package FX_Trading_Assignment;

import java.util.ArrayList;

public class PrintTrade {

	static ArrayList<Customer_data> data = new ArrayList<>();
	static int count =0;
	static void add(String name, String currencypair, double d, int getrate ) {
		Customer_data cd =new Customer_data();
		
		count++;
		cd.setTradeno(count);
		cd.setName(name);
		cd.setCurrencypair(currencypair);
		cd.setAmount(d);
		cd.setGetrate(getrate);
		data.add(cd);
		
	}
	
	public void printTrade() {
		System.out.println("Trade no" +"currencypair\t" + "customername\t" + "amount\t" + "rate");
		for(Customer_data print :data)
		System.out.println(print.getTradeno()+"\t"+print.getCurrencypair()+"\t\t"+print.getName()+"\t\t"+print.getAmount()+"\t"+print.getGetrate());
	}

}
