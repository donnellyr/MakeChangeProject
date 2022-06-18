package comm.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pay, price;
		System.out.println("What is the price of the item?");
		price = input.nextDouble();
		System.out.println("How much did the customer pay?");
		pay = input.nextDouble();
		String change = change(pay, price);
		System.out.println(change);
		input.close();
		
		
	}
	public static String change(double pay, double price) {
		double change = pay - price;
		String output ="Item price: $" + price +" Amount payed: $" + pay + " ERROR INSUFICIANT FUNDS";
		int twenty = 0, ten = 0, five = 0, one = 0, quarter = 0, dime = 0, nickle = 0, penny = 0; 
		if(change == 0) {
			output = "Item price: $" + price +" Amount payed: $" + pay + " Exact amount recived no change needed";
		}
		else if(change > 0) {
			output = "Item price: $" + price +" Amount payed: $" + pay + " Change Tendered:";
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
