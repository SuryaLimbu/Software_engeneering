package week3;
import java.util.*;
public class SwapValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int firstValue = scan.nextInt();
		System.out.println("Enter second value: ");
		int secondValue = scan.nextInt();

		int temp = firstValue;
		int first = secondValue;
		int second = temp;
		System.out.println("Before swaping the values  "+ firstValue+", "+secondValue);
		System.out.println("After swaping values  "+ first+", "+second);
	}

}
