package FX_Trading_Assignment;

public class Customer_data {
	
	private String name;
	int tradeno=0;
	private String currencypair;
	private double amount;
	private int getrate;
	
	
	public Customer_data() {
	
	}
	
	
	
	public Customer_data(int tradeno,String name, String currencypair, long amount, int getrate) {
		super();
		this.name = name;
		this.tradeno = tradeno;
		this.currencypair = currencypair;
		this.amount = amount;
		this.getrate = getrate;
	}



	public int getTradeno() {
		return tradeno;
	}
	public void setTradeno(int tradeno) {
		this.tradeno = tradeno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrencypair() {
		return currencypair;
	}
	public void setCurrencypair(String currencypair) {
		this.currencypair = currencypair;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double usdinr) {
		this.amount = usdinr;
	}
	public int getGetrate() {
		return getrate;
	}
	public void setGetrate(int getrate) {
		this.getrate = getrate;
	}



	@Override
	public String toString() {
		return "Customer_data [name=" + name + ", tradeno=" + tradeno + ", currencypair=" + currencypair + ", amount="
				+ amount + ", getrate=" + getrate + "]";
	}
	


	
	
	
	
	
	
}
