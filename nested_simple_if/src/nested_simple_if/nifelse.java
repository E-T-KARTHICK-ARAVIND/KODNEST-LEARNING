package nested_simple_if;

import java.util.Scanner;

public class nifelse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if(age>=13)
		{
		  if(age>=18)
		 {
		    System.out.println("Adult");
		 }
		  else
		 {
		    System.out.println("Teenager");
		 }
		}
		else
		{
		  if (age > 0)
		 {
		    System.out.println("Child");
		 }
		  else
		 {
		    System.out.println("Something went wrong"); 
		 }
		}
	}

}
