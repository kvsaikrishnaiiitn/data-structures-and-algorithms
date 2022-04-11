package com.cms.ds;

public class StackUsingArray<X> implements Stack<X> {

	X[] data;
	int stackPointer;

	public StackUsingArray() {
		data = (X[]) new Object[100];
		stackPointer = 0;
	}

	@Override
	public X push(X element) {
		data[stackPointer++] = element;
		return element;
	}

	@Override
	public X pop() {
		return data[--stackPointer];
	}

	@Override
	public int size() {
		return stackPointer;
	}

	@Override
	public X find(X element) {
		while (stackPointer > 0) {
			X topElement = pop();
			if (topElement.equals(element)) {
				return element;
			}
		}
		throw new IllegalStateException("Element not found:"+ element);
	}
}
