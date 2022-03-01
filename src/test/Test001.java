package test;

import java.util.Stack;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(){{[]}})";
		System.out.println(parentheses(str));
	}
	
	public static boolean parentheses(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (stack.isEmpty()) {
				return false;
			} else if (ch == ')') {
				if (stack.pop() != '(') return false;
			} else if (ch == '}') {
				if (stack.pop() != '{') return false;
			} else if (ch == ']') {
				if (stack.pop() != '[') return false;
			}
		}		
		return true;
	}

}
