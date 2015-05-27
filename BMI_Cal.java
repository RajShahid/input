package input;

import java.util.Scanner;

public class BMI_Cal {

	private static float height;
	private static int weight;
	private static int feet;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a height in m ");
		height = in.nextFloat();
		
		System.out.println("Enter a weight in kg ");
		weight = in.nextInt();
		
		System.out.println("Your BMI is = " +  (weight/( (height * height))));
		System.out.println();
		
		System.out.println("Input Height in Inches ");
		height = in.nextFloat();
		
		System.out.println("Input Weight in pounds ");
		weight = in.nextInt();
		
		System.out.println("Your BMI is = " + ((weight/2.2)/((height*0.0254) * (height*0.0254))));
		System.out.println();
		
		System.out.println("Input Height in Feet ");
		feet = in.nextInt();
		
		System.out.println("Input Height in Inches ");
		height = in.nextFloat();
		
		System.out.println("Input Weight in pounds ");
		weight = in.nextInt();
		System.out.println("Your BMI is = " + ((weight/2.2)/((height*0.0254) * (height*0.0254))));
	}
}
