package com.cms.ds;

public class StackCheck {

	public static void main(String[] args) {

		Stack<Integer> stackUsingArray = new StackUsingArray<>();

		stackUsingArray.push(1);
		stackUsingArray.push(2);
		stackUsingArray.push(3);
		stackUsingArray.push(4);
		stackUsingArray.push(5);

		System.out.println(stackUsingArray.size());

		System.out.println(stackUsingArray.pop());

		System.out.println(stackUsingArray.size());
		System.out.println(stackUsingArray.push(6));
		System.out.println(stackUsingArray.size());

		System.out.println(stackUsingArray.find(3));
		
		System.out.println(stackUsingArray.size());
		
		System.out.println(stackUsingArray.find(10));
		

	}

}
