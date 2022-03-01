package test;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000;
		int b = 500;
		System.out.println(greastestCommonFactor(a,b));
	}
	
	public static int greastestCommonFactor(int num1, int num2) {
		int min = num1 < num2 ? num1 : num2;
		int ans = 0;
		for (int i = 2; i < min / 2 + 1; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				ans = i;
		}
		return ans;
	}

}
