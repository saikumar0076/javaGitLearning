package operatorsAndExpressions;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 14,b=5;double z;
		float c= (float)(a/b); //if you apply brakcet typecast wont effect
		int r=(a/b);
		float m = (float)a/b; // typecast
		System.out.println(c);
		System.out.println(r);
		System.out.println(m);
		
		z=Math.sqrt(m);
		System.out.println(z);
	}
 
}
