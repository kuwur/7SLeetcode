package test;

public class Test006 {

	public static void main(String[] args) {
		int a = 10;
		char lev;
		switch(a) {
			case 10: lev = 'S';
			case 8: lev = 'A'; break;
			case 9: lev = 'B'; break;
			default: lev = 'C';
		}
		System.out.println(lev); //印出A
	}

	public static int strStr(String haystack, String needle) {
		if (needle == null || haystack == null) return 0;
		if (needle.length() == 0 ) return 0;
		
		return haystack.indexOf(needle);
	}

}
