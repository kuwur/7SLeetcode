package test;

public class Test009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci(10);
	}
	
	private static void fibonacci(int num) {
		System.out.println(0);
		if (num == 1) return;
		System.out.println(1);
		if (num == 2) return;
		int pre = 1;
		int next = 1;
		int temp = 0;
		while(num > 2) {
			System.out.println(next);
			temp = next;
			next = next + pre;
			pre = temp;
			num--;
		}
	}

}
