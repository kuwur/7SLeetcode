package practice;

import java.util.ArrayList;

public class L066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,5,4,6,6,4,3,2,1,0};
		int[] b = plusOne(a);
		for(int i : b) {
			System.out.println(i);
		}
		
//		int newLen = String.valueOf(9234567890L).length();
//		System.out.println(newLen);
	}
	
    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<Integer>();
    	int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
        	int temp = digits[i] + carry;
        	carry = temp / 10;
        	list.add(temp % 10);
        }
        if (carry == 1) {
        	list.add(1);
        }
        
        int len = list.size();
        int[] ans = new int[len];
        for(int i : list) {
        	ans[len-1] = i;
        	len--;
        }
    	return ans;
    	
    }

}
