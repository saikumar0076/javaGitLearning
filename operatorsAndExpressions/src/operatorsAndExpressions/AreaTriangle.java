package operatorsAndExpressions;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		float h;
		float area;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the base of a triangle");
		float b=s.nextInt();
		System.out.println("base is "+b);
		System.out.println("enter the height of a triangle");
		h=s.nextInt();
		System.out.println("height is "+h);
		area= b*h/2;
		System.out.println("area of a triangle is "+area);
	}

}
