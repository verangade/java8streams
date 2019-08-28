package com.test.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAdvance {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,21,4,6,9,25,53,1,12);
		List<String> employeeList = Arrays.asList("Micheal","Amal","Kamal","Sena","Tony","Thor","Luke");
		Stream<Integer> stream = list.stream();
		
		
		list.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		System.out.println();
		/**
		 * use lambda to implement Consumer functional interface reduce lines of codes
		 */
		list.stream().forEach(i -> System.out.println(i));
		
		System.out.println();
		/**
		 * make it simple further removed lamnda here
		 */
		list.stream().forEach(System.out::println);
		
		System.out.println();
		/**
		 * skip function to skip up to certain elements
		 */
		list.stream().skip(5).forEach(i -> System.out.println(i));
		
		/**
		 * sort the list
		 */
		System.out.println();
		list.stream().sorted().forEach(i->System.out.println(i));
		System.out.println();
		
		/**
		 * sort the String list
		 */
		employeeList.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		System.out.println();
		employeeList.stream().sorted().forEach(i -> System.out.println(i));
		/**
		 * 
		 * fist element
		 */
		System.out.println(list.stream().findFirst().get());
		
		/**
		 * filter sort print
		 * 
		 */
		System.out.println();
		employeeList.stream().filter(w -> w.startsWith("T")).forEach(i -> System.out.println(i));
		
		System.out.println("IntStream");
		/**
		 * Integer Stream
		 * 
		 */
		long i = IntStream.range(1, 5).count();
		System.out.println(i);
		
		int x = IntStream.range(1, 5).sum();
		System.out.println(x);
		
		IntStream.range(1,10).forEach(System.out::print);
		
		System.out.println("");
		System.out.println(IntStream.range(1,10).skip(2).count()); 
		IntStream.range(1,10).skip(4).forEach(o -> System.out.println(o));
		
	}	
	

}

