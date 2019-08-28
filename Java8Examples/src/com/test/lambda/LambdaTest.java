package com.test.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		Person p = ()->System.out.println("Walking");
		p.walk();
		
		Animal animal = (p1)->System.out.println("Drinking "+p1);
		animal.drink("hoo");
		
		Employee e = (s,t)->{
			System.out.println("Employee place "+s);
			System.out.println("Working hours "+t);
			
			if(t<8) {
				System.out.println("low");
			}
		};
		
		e.work("Galle", 6);
	}
	
	interface Person {
		
		public void walk();
		
		public default void run() {
			
		}
	}
	
	interface Animal{
		public void drink(String param);
	}
	
	interface Employee{
		public void work(String place,int hours);
	}

}
