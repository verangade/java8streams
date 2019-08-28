package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest {
	
	public static void main(String[] args) {
		List<String> employeeList = Arrays.asList("Micheal","Amal","Kamal","Sena","Tony","Thor","Luke");
		
		for (String s : employeeList) {
			System.out.println(s);
		}
		
		System.out.println();
		
		employeeList.stream().filter(pr -> {return pr.equals("Kamal");}).findAny();
		
		System.out.println( employeeList.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.equals("Kamal");
			}
			
		}).findAny().get());;
		
		
		//for predicate implementation here use lambda
		System.out.println( employeeList.stream().filter(pr -> {return pr.equals("Kamal");}).findAny().get());;
		
		
		
		
		employeeList.stream().filter(pt -> {return pt.equals("Tony");}).forEach(p  -> System.out.println("Find"+p));
		
		/**
		 * 
		 *  filter method inside parameter is called predicate
		 *  Predicate is a functional interface
		 *  new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.equals("Kamal");
			}
		};
		
		this implementation is the one we shorted by using lambda
		pr -> {return pr.equals("Kamal");}
		 
		 *
		 */
		
	}
	
	
}
