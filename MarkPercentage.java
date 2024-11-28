package sam1_L2;

import java.util.Scanner;

abstract class ClassA {
	protected double mark1;
	protected double mark2;
	protected double mark3;
	
	public ClassA() {
		
	}
	
	public ClassA(double mark1, double mark2, double mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}

	public double getMark3() {
		return mark3;
	}

	public void setMark3(double mark3) {
		this.mark3 = mark3;
	}
	
	abstract public double getPercentage();
}


class ClassB extends ClassA{
	private double mark4;
	private double mark5;
	private double mark6;
	private double mark7;
	
	public ClassB() {
		
	}
	
	public ClassB(double mark4, double mark5, double mark6, double mark7) {
		this.mark4 = mark4;
		this.mark5 = mark5;
		this.mark6 = mark6;
		this.mark7 = mark7;
	}
	
	public ClassB(double mark1, double mark2, double mark3, double mark4, double mark5, double mark6, double mark7) {
		super(mark1, mark2, mark3);
		this.mark4 = mark4;
		this.mark5 = mark5;
		this.mark6 = mark6;
		this.mark7 = mark7;
	}

	public double getMark4() {
		return mark4;
	}

	public void setMark4(double mark4) {
		this.mark4 = mark4;
	}

	public double getMark5() {
		return mark5;
	}

	public void setMark5(double mark5) {
		this.mark5 = mark5;
	}

	public double getMark6() {
		return mark6;
	}

	public void setMark6(double mark6) {
		this.mark6 = mark6;
	}

	public double getMark7() {
		return mark7;
	}

	public void setMark7(int mark7) {
		this.mark7 = mark7;
	}

	@Override
	public double getPercentage() {
		return (mark1 + mark2 + mark3 + mark4 + mark5 + mark6 + mark7)/7;
	}
}

public class MarkPercentage{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mark1 : ");
		Double m1 = scan.nextDouble();
		System.out.println("Enter mark2 : ");
		Double m2 = scan.nextDouble();
		System.out.println("Enter mark3 : ");
		Double m3 = scan.nextDouble();
		System.out.println("Enter mark4 : ");
		Double m4 = scan.nextDouble();
		System.out.println("Enter mark5 : ");
		Double m5 = scan.nextDouble();
		System.out.println("Enter mark6 : ");
		Double m6 = scan.nextDouble();
		System.out.println("Enter mark7 : ");
		Double m7 = scan.nextDouble();	
		scan.close();
		
		ClassA a = new ClassB(m1, m2, m3, m4, m5, m6, m7);
		System.out.println("The percentage is: " + String.format("%.2f", a.getPercentage()));
	}
}

