package week3;
import java.util.*;
public class PriceWithTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String euro = "\u20AC";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of pizzas: ");
		int pizzas = scan.nextInt();
		System.out.println("Enter numbers of tuppings: ");
		int tuppings = scan.nextInt();
		
		System.out.println("Total number of  pizzas: "+pizzas);
		System.out.println("Total numbers of tuppings: "+ tuppings);
		
		double priceOfPizza = pizzas*12.00;
		double priceOfTuppings = tuppings*1.50;
		double tax = (priceOfPizza+priceOfTuppings)*5/100;
		double totalPrice = priceOfPizza + priceOfTuppings + tax;
		
		System.out.println("Receipt");
		System.out.println("Total Price of pizzas: "+euro+priceOfPizza);
		System.out.println("Total price of Tuppings: "+euro+priceOfTuppings);
		System.out.println("Tax: "+euro+tax);
		System.out.println("Cost(inc.tax): "+euro+totalPrice);
		
		
	}

}
