package com.test.lambda.reduce;

import java.util.Arrays;

/**
 * Ref : https://www.concretepage.com/java/jdk-8/java-8-stream-reduce-example
 * 
 *Stream reduce() performs a reduction on the elements of the stream. It uses identity and accumulator function for reduction
 *
 *Stream reduce() can be used to get the sum of numbers stored in collection
 *
 * It can also concatenate the string data stored in collection with given separator. 
 * Stream reduce() method can perform many more reducing task as required
 */


public class StreamReduce {
	
	public static void main(String[] args) {
		
		int[] array = {23,43,56,97,32};
		
		/**
		 * Stream.reduce() with Accumulator
		 * Here we will pass BinaryOperator as accumulator. In case of numeric BinaryOperator, 
		 * the start value will be 0. In case of string, the start value will be a blank string
		 */
		
		
		Arrays.stream(array).reduce((x,y)->x+y).ifPresent(System.out::println);
		
		
	}

}
