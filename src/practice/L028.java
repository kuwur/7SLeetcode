package practice;

public class L028 {

	public static void main(String[] args) {
		int a = strStr("abb","bb");
		System.out.println(a);
	}
	
	public static int strStr(String haystack, String needle) {
		if (needle == null || haystack == null) return 0;
		if (needle.length() == 0 ) return 0;
		
		return haystack.indexOf(needle);
	}

}
