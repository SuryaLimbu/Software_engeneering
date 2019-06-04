package week3;
import java.util.*;
public class CmToInch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter centimeters: ");
		int cm = scan.nextInt();
		double inches = cm * 0.3937;
		
		System.out.println("Enter centimers as an interger: "+ cm);
		System.out.println("The value in inches is "+ inches);

	}

}
