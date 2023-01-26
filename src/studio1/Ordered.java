package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean decend1;
		
		boolean decend2;
		
		boolean isOrdered1;
		
		boolean ascend1;
		
		boolean ascend2;
		
		boolean isOrdered2;
		
		boolean isOrdered;
		
		isOrdered = x>y && y>z || z>y && y>x;
		
		System.out.println(isOrdered);
				

	}

}
