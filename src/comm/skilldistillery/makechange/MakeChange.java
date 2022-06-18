package comm.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		userInfo();
		
		
		
	}
	public static void userInfo() {
		String response;
		Scanner input = new Scanner(System.in);
		double pay = 0, price = 0;
		
		System.out.println("What is the price of the item?");
		price = input.nextDouble();
		System.out.println("How much did the customer tender?");
		pay = input.nextDouble();
		String change = change(pay, price);
		System.out.println(change);
		
		System.out.println("Would you like to make another transaction?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		response = input.nextLine();
		response = input.nextLine();
		switch(response) {
		case "1":
		case "Yes":
		case "yes":userInfo();
		break;
		case "2":
		case "No":
		case "no": System.out.println("Have a good day!");
		break;
		default: System.out.println("INVALID CHOICE");
		}
		input.close();
		
	}
	public static String change(double pay, double price) {
		float change = (float)(pay - price);
		String output ="Item price: $" + price +" Amount tendered: $" + pay + " ERROR INSUFICIANT FUNDS $" + (change * -1) + " NEEDED TO COMPLETE TRANSACTION";
		int twenty = 0, ten = 0, five = 0, one = 0, quarter = 0, dime = 0, nickle = 0, penny = 0; 
		if(change == 0) {
			output = "Item price: $" + price +" Amount tendered: $" + pay + " Exact amount recived no change needed";
		}
		else if(change > 0) {
			output = "Item price: $" + price +" Amount tendered: $" + pay + " Change owed: $" + change + " Denominations distributed:";
			while(change >= 20.0) {
				change-=20.0;
				twenty++;
			}
			while(change >= 10.0) {
				change-=10.0;
				ten++;
			}
			while(change >= 5.0) {
				change-=5.0;
				five++;
			}
			while(change >= 1.0) {
				change-=1.0;
				one++;
			}
			while(change >= 0.25) {
				change-=0.25;
				quarter++;
			}
			while(change >= 0.10) {
				change-=0.10;
				dime++;
			}
			while(change >= 0.05) {
				change-=0.05;
				nickle++;
			}
			while(change > 0.001) {
				change-=0.01;
				++penny;
			}
			if(twenty == 1) {output += " "+ twenty +" twenty dollar bill,";}
			if(twenty > 1) {output += " "+ twenty +" twenty dollar bills,";}
			
			if(ten == 1) {output += " "+ ten +" ten dollar bill,";}
			if(ten > 1) {output += " "+ ten +" ten dollar bills,";}
			
			if(five == 1) {output += " "+ five +" five dollar bill,";}
			if(five > 1) {output += " "+ five +" five dollar bill,s";}
			
			if(one == 1) {output += " "+ one +" one dollar bill,";}
			if(one > 1) {output += " "+ one +" one dollar bills,";}
			
			if(quarter == 1) {output += " "+ quarter +" quarter,";}
			if(quarter > 1) {output += " "+ quarter +" quarters,";}
			
			if(dime == 1) {output += " "+ dime +" dime,";}
			if(dime > 1) {output += " "+ dime +" dimes,";}
			
			if(nickle == 1) {output += " "+ nickle +" nickle,";}
			if(nickle > 1) {output += " "+ nickle +" nickles,";}
			
			if(penny == 1) {output += " "+ penny +" penny";}
			if(penny > 1) {output += " "+ penny +" pennies";}
			return output;
		}
		return output;
	
}
}
