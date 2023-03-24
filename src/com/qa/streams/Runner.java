package com.qa.streams;

import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//task1
		List<String> names = Arrays.asList("Michael","Dean","James","Chris");
		names.stream()
			.forEach(x-> System.out.println("Hello "+x));
		
		//task2
		List<Integer> numbers = Arrays.asList(3,4,7,8,12);
		int product 
			= numbers.stream()
			.reduce((a,b)->a*b)
			.get();
		System.out.println("product = "+ product);
		
		//task3
		List<Integer> numbers1 = Arrays.asList(6,12,7,3,4,2,5);
		Integer max = numbers1
				.stream()
				.reduce( (a,b)-> Math.max(a, b)).get();
		
		System.out.println(max);
		
		Integer min = numbers1
				.stream()
				.reduce( (a,b)-> Math.min(a, b)).get();
		
		System.out.println(min);
		
		List<Integer> evenNumbers = numbers1
				.stream()
				.filter(x->x%2==0).toList();
		
		System.out.println(evenNumbers);
		
		
		List<Integer> oddNumbers = numbers1
				.stream()
				.filter(x->x%2!=0).toList();
		
		System.out.println(oddNumbers);

		
		Integer sum = numbers1
				.stream()
				.reduce((a,b)->a+b).get();
		
		System.out.println(sum);
		
		Integer result = numbers1
				.stream()
				.map(x -> x*x)
				.filter(x->x%2!=0)
				.reduce( (a,b)-> Math.min(a, b)).get();
		
		System.out.println(result);
		
	}
	
		

}
