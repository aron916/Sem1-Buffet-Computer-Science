/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		System.out.println("Welcome to Aron's Grill.");
		System.out.println("Here's our menu.");
		System.out.println("Griled Chicken $6.99.");
		System.out.println("Steak $7.99");
		System.out.println("Carne Asada $8.99.");
		System.out.println("Salmon $5.99.");
		System.out.println("Fried Chicken $4.99.");
		System.out.println("Shrimp $6.99.");
		System.out.println("Brown Rice $7.99.");
		System.out.println("White Rice $4.99.");
		System.out.println("Chicken Afredo Pasta $5.99.");
		System.out.println("Spaguattti $5.99.");
		System.out.println("Lasaguana $7.99.");
		System.out.println("Macroni and Cheese $6.99.");
		System.out.println("Taryccii Chicken.");
		System.out.println("Fried Rice.");
		System.out.println("What's the name of the order?");
		String name = sc.nextLine();
		System.out.println("How many Fried Chicken or Tenders?");
main		System.out.println("How many Steaks?");
		int item2 = sc.nextInt();
		System.out.println(" How many Carne Asada?");
		int item3 = sc.nextInt();
		
		System.out.println("How much would you like to tip.");
		double tip = sc.nextDouble();
		System.out.println();
		System.out.println(" ");
		System.out.println(name + "s Receipt");
		double price1 = item1 * 5.99;
		double price2 = item2 * 7.99;
		double price3 = item3 * 8.99;
		System.out.println(item1 + "  x Pollo Asado = $" + price1);
		System.out.println(item2 + " x Carne Asada = $" + price2);
		System.out.println(item3 + " x Steak = $" + price3);
		double total = price1 + price2 + price3 + tip;
		System.out.println("                         ");
		System.out.println(" The Grand Total is - " + total);
		
	
		
		
		
		
	}
		
}
