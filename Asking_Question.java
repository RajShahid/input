package input;
import java.util.Scanner;

public class Asking_Question {

	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age,inch;
		String height;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you ?" );
		height = keyboard.next();
		
		System.out.print( "And how many inches?" );
		inch = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height+"`"+inch+"``"+ " tall and " + weight + " heavy." );

	}

}
