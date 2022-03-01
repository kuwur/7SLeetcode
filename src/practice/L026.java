package practice;

public class L026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random() * 10)+1;
		System.out.println(a);
	}
	
    public int removeDuplicates(int[] nums) {
        
    	int i = 0;
    	for (int j = 1; j < nums.length; j++) {
        	if (nums[i] == nums[j]) {
        		continue;
        	}
        	if (nums[i] != nums[j]) {
        		i++;
        		nums[i] = nums[j];
        	}
        }
    	return ++i;
    }

}
