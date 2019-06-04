package week3;

public class IndependentExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x =2, y =5;
		double z = 7.3;
		
		int a = 8- ++y;
		int b = (x++) +3;
		int c = 2 * (++y) + (int)(z);
		int d = 2 * (++x) + (y++) + x++;
		
		System.out.println("1)8- ++y = "+ a);
		System.out.println("2)(x++) +3 = "+ b);
		System.out.println("3)2 * (++y) + (int)(z) = "+ c);
		System.out.println("4)2 * (++x) + (y++) + x++ = "+d);
	}

}
