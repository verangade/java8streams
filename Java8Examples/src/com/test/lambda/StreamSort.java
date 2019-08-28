package com.test.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amal","Kamal","Dilan","Micheal","Sean","Kim","Roger","Kamal");
		
		//looping
		list.stream().forEach(System.out::println);
		
		System.out.println();
		//Sorting
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println();
		//Reverse order sorting
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println();
		//comparator
		//list.stream().sorted(Comparator.comparing(keyExtractor))
		//list.stream().sorted
		
	}
	
}
