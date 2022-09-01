
import java.util.Scanner;

public class StudentResult {
	
	public static void main(String[] args) {
		
		float english, maths, science;
		double total, average, percentage;
		
		Scanner op=new Scanner(System.in);
		
	    System.out.println("Enter marks of three subjects:");
	    
	    System.out.println("Enter marks of english subjects:");
	    english=op.nextFloat();
	    
	    System.out.println("Enter marks of maths subjects:");
	    maths=op.nextFloat();
	    
	    System.out.println("Enter marks of science subjects:");
	    science=op.nextFloat();
	    
	    total = english + maths + science;
	    average = (total / 3.0);
	    percentage = (total / 300.0) *100;
	    
	    System.out.println("Total marks ="+total);
	    System.out.println("Average marks = "+average);
	    System.out.println("Percentage = "+percentage);
	    
	}
}