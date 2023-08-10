package ifConditionalConstruct;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number");
    int marks=scan.nextInt();
    System.out.println("Welcome to KodNest");
    tech(marks);
    
	}
	
	public static void tech(int mark)
	{
		
		if(mark>=80)
		{
		System.out.println("Welcome to Tech club");
		}
		
		
		
	}

}
