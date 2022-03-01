package practice;

public class L034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
    public int[] searchRange(int[] nums, int target) {
    	if (nums == null && nums.length == 0) return null;
    	int[] ans = {-1,-1};
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == target) {
    			ans[0] = i;
    			break;
    		}
    	}
    	for (int i = nums.length - 1; i > -1; i--) {
    		if (nums[i] == target) {
    			ans[1] = i;
    			break;
    		}
    	}
    	return ans;
    }
}
