package FX_Trading_Assignment;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		
		while(flag == 1) {
			System.out.println(" Book trade - 1\n"
					+ "Print trade - 2\n"
					+ "Exit - 3");
			int userchoice =  sc.nextInt();
			switch (userchoice) {
				case 1: 
					
					BookTrade bt = new  BookTrade();
					bt.booking();
					break;	
				case 2:
					PrintTrade pt = new PrintTrade();
					pt.printTrade();
					break;
				
				case 3:
					System.out.println("Do you really want to exit (y/n)");
					String choice = sc.next();
					if(choice.equalsIgnoreCase("y")) {
						System.out.println("Bye - have a good day");
					}
					else if(choice.equalsIgnoreCase("n"))
						flag = 1;
					
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + userchoice);
					
			}
			if(userchoice ==3) {
				flag=0;
			}
			
		}
		
	}

}
