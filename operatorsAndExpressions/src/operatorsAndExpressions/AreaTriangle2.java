package operatorsAndExpressions;

import java.util.Scanner;

public class AreaTriangle2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner user = new Scanner(System.in);
		System.out.println("enter three values of side");
		a =user.nextInt();
		b = user.nextInt();
		c = user.nextInt();
		if((a+b)>c) {
			float s =(float) (a+b+c)/2;
			float m=s*(s-a)*(s-b)*(s-c);
			double area;
			area=Math.sqrt(m);
			System.out.println("area is "+area);
			
		}
		else { 
			System.out.println("Invalid input: make sure a+b>c");
			
			}
		
		
	}

}
