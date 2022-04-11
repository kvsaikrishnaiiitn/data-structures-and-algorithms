package com.cms.ds;

public class StackCustom {

	private int[] arr;
	private int size;
	private int top;

	public StackCustom(int size) {
		this.size = size;
		this.arr = new int[size];
		top = -1;
	}

	boolean isFull() {
		return top == size - 1;
	}

	boolean isEmpty() {
		return top == -1;
	}

	public void push(int x) {
		if (!isFull()) {
			top++;
			arr[top] = x;
		} else {
			throw new RuntimeException("Stack over flow");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int topElement = arr[top];
			top--;
			return topElement;
		} else {
			throw new RuntimeException("Stack under flow");
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			throw new RuntimeException("Stack under flow");
		}
	}

	public int size() {
		return top;
	}

	public void printStack() {
		for (int index = 0; index <= top; index++) {
			System.out.println(arr[index]);
		}
	}

}
