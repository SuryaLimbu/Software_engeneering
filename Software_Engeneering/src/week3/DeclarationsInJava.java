package week3;

public class DeclarationsInJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int num1 = 12, num2 = 4, num3 = 14, num4 = 5;
	double val1 = 3.0;
	double result1 = 2 + num1 / num2;
	int result2 = (num4 + 1) % num2;
	int result3 = 5 + (int) (3+val1/2);
	double result4 =(double) (13/num4-4);
	double result5 =((double) (num3+1) / 2);
	
	System.out.println("2 + num1 / num2 = "+ result1);
	System.out.println("(num4 + 1) % num2 = "+result2);
	System.out.println("5 + (int) (3+val1/2) = "+ result3);
	System.out.println("(double) (13/(num4-4)) = " +result4);
	System.out.println("((double) (num3+1) / 2) = "+result5);

	}

}
