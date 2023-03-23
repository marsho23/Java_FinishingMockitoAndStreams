package com.qa.lambdas;

public class LambdaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation addition = (a,b) -> a+b;
		Calculation division = (a,b) -> a/b;
		Calculation subtraction = (a,b) -> a-b;
		Calculation multiplication = (a,b) -> a*b;
		
		System.out.println(addition.calculate(12, 24));
		System.out.println(division.calculate(4,2));
		System.out.println(subtraction.calculate(12, 24));
		System.out.println(multiplication.calculate(3,4));



	}

}
