package test;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "1567";
		String str2 = "1234";
		System.out.println(longestSubstring(str1, str2));
	}
	
	public static String longestSubstring(String str1, String str2) {
		if (str1 == null || str2 == null) return null;
		if (str1.length() == 0 || str2.length() == 0) return null;
		
		String longStr = str1.length() > str2.length() ? str1 : str2;
		String shortStr = str1.length() > str2.length() ? str2 : str1;
		int shortLen = shortStr.length();
		for (int i = shortLen; i > 0; i--) {
			for (int j = 0; j < shortLen - i + 1; j++) {
				String currStr = shortStr.substring(j, j + i);
				if (longStr.indexOf(currStr) != -1) {
					return currStr;
				}
			}
		}
		return null;
	}
}
