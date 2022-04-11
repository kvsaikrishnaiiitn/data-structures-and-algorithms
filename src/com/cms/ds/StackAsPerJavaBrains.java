package com.cms.ds;

public class StackAsPerJavaBrains {

	int[] data;
	int top;
	int capacity;

	public StackAsPerJavaBrains(int capacity) {
		data = new int[capacity];
		this.capacity = capacity;
		top = -1;
	}

	// push
	public void push(int x) {
		if (isFull()) {
			throw new RuntimeException("Stack is full");
		}
		data[++top] = x;
	}

	// pop
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return data[top--];
	}

	// peek
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return data[top];
	}

	// isFull
	public boolean isFull() {
		return top == capacity - 1;
	}

	// isEmpty
	public boolean isEmpty() {
		return top == -1;
	}

}
