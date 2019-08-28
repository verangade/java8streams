package com.test.lambda;

public class Test {
	public static void main(String[] args) {
		
		int roundRobinQueuesPos =-2;
		 String[] outBoundQueueNames = new String[3];
		 outBoundQueueNames[0] = "A";
		 outBoundQueueNames[1] = "B";
		 
		 String queueName = outBoundQueueNames[(roundRobinQueuesPos >= outBoundQueueNames.length - 1)
          	                                    ? (roundRobinQueuesPos = 0) : (++roundRobinQueuesPos)]; 
		 System.out.println(queueName);
		 System.out.println(roundRobinQueuesPos);

	}

}
