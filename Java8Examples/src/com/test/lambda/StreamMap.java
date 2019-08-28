package com.test.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {
		/**
		 * map
		 * 
		 */
		System.out.println();
		//get square
		Arrays.stream(new int[] {3,6,7,1,9,10,8,5}).map(x -> x*x).forEach(System.out::println);
		
		List<String> list = Arrays.asList("Amal","Kaml","Dilan","Micheal","Sean","Kim","Roger");
		
				list.stream().map(String::toLowerCase)
				.filter(x -> x.startsWith("k"))
				.forEach(System.out::println);

	}

}
