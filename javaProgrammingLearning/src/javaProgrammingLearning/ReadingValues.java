package javaProgrammingLearning;

import java.util.Scanner;

public class ReadingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		String name;
		Scanner s = new Scanner(System.in);
		System.out.println("enter any name");
		name=s.nextLine();
		System.out.println("your name is "+ name);
		
			  System.out.println("enter any number1"); 
			  a=s.nextInt();
			  System.out.println("enter any number2");
			  b=s.nextInt(); c=a+b;
			  System.out.println("the number is " +c);
			 
			
			
	}

}
