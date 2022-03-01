package practice;

public class L058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " dfef dfe tggggrt    ";
		System.out.println(lengthOfLastWord(a));
	}
	
    public static int lengthOfLastWord(String s) {
        while (s.lastIndexOf(' ') == s.length()-1) {
        	s = s.substring(0, s.length()-1);
        }
        int ans = 0;
        while (ans < s.length() && s.charAt(s.length()-1-ans) != ' ') {
        	ans++;
        }
        return ans;
    }
}
