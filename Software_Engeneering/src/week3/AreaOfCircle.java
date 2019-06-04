package week3;
import java.util.*;
public class AreaOfCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter radius of a circle: ");
	double r = scan.nextDouble();
	
	double a = Math.PI *r *r;
	System.out.println("Entered Radius of a circle is "+r);
	System.out.println("Area of circle is "+a);
	

	}

}
