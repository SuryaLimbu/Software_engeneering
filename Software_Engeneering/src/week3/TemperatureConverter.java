package week3;
import java.util.*;
public class TemperatureConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Farenheit: ");
		double f = scan.nextDouble();
		
		double c = (f-32)*5/9;
		System.out.println("Entered temperature in Farenheit: "+f);
		System.out.println(f+" in Farenheit is "+ c +" Celcius");
		
		

	}

}
