package test;

import java.util.Stack;

public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3+2*2";
		System.out.println(calculate(s));
				
	}

	public static int calculate(String s) {
		Stack<Integer> stack = new Stack<>();
		s = s + '+';
		char operation = '+';
		int currVal = 0;
		for (int i = 0; i < s.length(); i++) {
			char currCh = s.charAt(i);
			if (currCh == ' ')
				continue;
			if (Character.isDigit(currCh)) {
				currVal = currVal * 10 + (currCh - '0');
				continue;
			}

			if (operation == '+') {
				stack.push(currVal);
				currVal = 0;
			} else if (operation == '-') {
				stack.push(-currVal);
				currVal = 0;
			} else if (operation == '*') {
				currVal = stack.pop() * currVal;
				stack.push(currVal);
				currVal = 0;
			} else if (operation == '/') {
				currVal = stack.pop() / currVal;
				stack.push(currVal);
				currVal = 0;
			}
			operation = currCh;
		}
		int ans = 0;
		while (!stack.isEmpty()) {
			ans = ans + stack.pop();
		}
		return ans;
	}

}
