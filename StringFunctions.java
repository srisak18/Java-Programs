package String_practice;

import java.util.Scanner;

class Vehicle{
	
	String color = "red";
	int price = 2000;
	int cc=1300;
	
	public Vehicle()
	{
		System.out.println("Vehicle constructor is called");
	}
	
	public Vehicle(String color) {
		this.color = color;
	}
	
	public void start(){
		System.out.println("vechile Started");
		
	}
	
}

class Car extends Vehicle{
	
	String brand = "swift";
	int mileage =25;
	
	public Car()
	{
		super();
	}
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	public void start() {
		System.out.println("Car started");
	}
	public void race()
	{
		System.out.println("reach 1km @ 30 seconds");
	}
	
}

public class StringFunctions {

	public static void main(String[] args) {
		
		Vehicle c = new Car();
		
		c.start();
		System.out.println(c.color);
		System.out.println(c.price);
	
	}	
}
