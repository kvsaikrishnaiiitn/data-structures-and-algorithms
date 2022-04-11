package com.cms.ds;

public class StackSortUsingDoubleStack {

	public static void main(String[] args) {

		StackCustom mainStack = new StackCustom(3);
		mainStack.push(5);
		mainStack.push(10);
		mainStack.push(2);

		/*
		 * while (!mainStack.isEmpty()) { System.out.println(mainStack.pop()); }
		 */

		StackCustom sortedStack = sortStack(mainStack);
		System.out.println("After sorting:");
		/*
		 * while (!sortedStack.isEmpty()) { System.out.println(sortedStack.pop()); }
		 */
		
		sortedStack.printStack();

	}

	public static StackCustom sortStack(StackCustom mainStack) {
		StackCustom tempStack = new StackCustom(10);
		while (!mainStack.isEmpty()) {
			int currentData = mainStack.pop();
			System.out.println("currentData:" + currentData);
			while (!tempStack.isEmpty() && tempStack.peek() > currentData) {
				System.out.println("tempStack.peek() > currentData:" + tempStack.peek() + ">" + currentData);
				mainStack.push(tempStack.pop());
			}
			tempStack.push(currentData);
		}
		return tempStack;
	}

}
