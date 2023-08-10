package nested_simple_if;

import java.util.Scanner;

public class nsif {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark=scan.nextInt();

		if(mark>=50)
		{
			System.out.println("you have passed");
			if(mark==100)
			{
				System.out.println("congrats you are the topper");
			}
		}
	}

}
