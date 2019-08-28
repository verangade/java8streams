package com.test.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamMore {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Amal","Kamal","Dilan","Micheal","Sean","Kim","Roger","Kamal");
		
		//looping
		list.stream().forEach(System.out::println);
		
		System.out.println();
		//distinct
		list.stream().distinct().forEach(System.out::println);
		
		
		
	}

}
