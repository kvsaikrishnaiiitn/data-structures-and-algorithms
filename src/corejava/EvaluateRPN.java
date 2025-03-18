package corejava;

import java.io.IOException;
import java.util.Stack;

public class EvaluateRPN {

	public static void main(String[] args) throws IOException {
		String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}

	private static int evalRPN(String[] tokens) {
		int result = Integer.MIN_VALUE;
		String operators = "+-*/";
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			if (!operators.contains(token)) {
				stack.push(Integer.valueOf(token));
			} else {
				int operatorIndex = operators.indexOf(token);
				int firstValue = stack.pop();
				int secondValue = stack.pop();

				switch (operatorIndex) {
				case 0:
					stack.push(firstValue + secondValue);
					break;
				case 1:
					stack.push(firstValue - secondValue);
					break;
				case 2:
					stack.push(firstValue * secondValue);
					break;
				case 3:
					stack.push(firstValue / secondValue);
					break;
				}
			}
		}
		result = stack.pop();
		return result;
	}

}
