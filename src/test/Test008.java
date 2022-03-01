package test;

public class Test008 {

	public static void main(String[] args) {
		armstrong();
	}
	
	public static void armstrong() {
		for (int i = 100; i < 1000; i++) {
			int first = i % 10;
			int second = i / 10 % 10;
			int third = i / 100;
			int total = (int)Math.pow(first, 3) +
						(int)Math.pow(second, 3) +
						(int)Math.pow(third, 3);
			if (total == i)
				System.out.println(i);
		}
		
	}

}
