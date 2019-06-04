package week3;
import java.util.*;
public class SecretNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println("Think of a number between 1 and 1000");
		System.out.println("Divided by 7 and tell me the remainder: ");
		int remainder1 = scan.nextInt();
		System.out.println("Divided by 11 and tell me the remainder: ");
		int remainder2 = scan.nextInt();
		System.out.println("Divided by 13 and tell me the remainder: ");
		int remainder3 = scan.nextInt();
		
		//Algorithm 
		int product = (remainder1*715)+(remainder2*364)+(remainder3*924);
		int result = product % 1001;
		System.out.println("Your secret number is "+result);
		}
		
		
		

	}

}
