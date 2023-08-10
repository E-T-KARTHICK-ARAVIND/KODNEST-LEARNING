package javapackage;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the speed of the vehicle");
    double speed=scan.nextDouble();
    System.out.println("Enter the speed of the vehicle");
    double time=scan.nextDouble();
    JourneyCalculator journeyCalculator = new JourneyCalculator();
	System.out.println(journeyCalculator.calculateDistance(speed, time));
	
    
    
    
    
    
	}

}
