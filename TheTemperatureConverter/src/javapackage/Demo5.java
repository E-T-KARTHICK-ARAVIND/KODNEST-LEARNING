package javapackage;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the degree of Farenheit");
		double farenheit=scan.nextDouble();
		TemperatureConverter TemperatureConverter=new TemperatureConverter();
		double c=TemperatureConverter.convertFahrenheitToCelsius(farenheit);
		System.out.println("the degree of farenheit converted to celsius is....."+c);
		
		

	}

}
