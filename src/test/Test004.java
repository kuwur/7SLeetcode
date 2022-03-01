package test;

import java.util.Stack;

public class Test004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int calculateWithParentheses(String s) {
		String str = s;
		Stack<Integer> stack = new Stack<>();
		char operation = '+';
		for (int i = 0; i < str.length(); i++) {

			int currVal = 0;
			char currCh = str.charAt(i);
			
			if (currCh == ' ')
				continue;

			if (Character.isDigit(currCh)) {
				while (i < str.length() && Character.isDigit(str.charAt(i))) {
					currVal = currVal * 10 + (str.charAt(i) - '0');
					i++;
				}
				i--;
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
			ans += stack.pop();
		}
		return ans;
	}

}
