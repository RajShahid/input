package input;

import java.util.Scanner;

public class Name_Age_Salary {

	private static String name ;
	private static int age;
	private static int salary;
	
	
	public static void main(String[] args) {
	
		System.out.println("Hello.  What is your name ?");
		Scanner in = new Scanner(System.in);
		name = in.next();
		
		System.out.println("Hi, "  + name + "! How old are you ");
		age = in.nextInt();
		
		System.out.println("So you're " + age + " , eh?  That's not old at all! ");
		System.out.println("How much do you make, " + name);
		salary = in.nextInt();
	
		System.out.println(salary +"!  I hope that's per hour and not per year! LOL!  ");
	}

}
