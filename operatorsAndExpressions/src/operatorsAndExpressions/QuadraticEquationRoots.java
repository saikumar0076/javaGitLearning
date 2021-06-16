package operatorsAndExpressions;

import java.util.Scanner;

public class QuadraticEquationRoots {

	public static void main(String[] args) {
		int a,b,c;
		double m,p,q;
		Scanner s = new Scanner(System.in);
		System.out.println("enter 3 values");
		a=s.nextInt();//a=1, b=5 , c= 6
		b=s.nextInt();
		c=s.nextInt();
		if((b*b)>=(4*a*c)) {
			m=Math.sqrt((b*b)-(4*a*c));
			p=(-b+m)/(2*a);
			q=(-b-m)/(2*a);
			System.out.println(p);
			System.out.println(q);
		}else {
			System.out.println("invalid input");
		}
		
	}

}
