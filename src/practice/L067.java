package practice;

public class L067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static String addBinary(String a, String b) {
    	Long binaryA = Long.valueOf(a);
    	Long binaryB = Long.valueOf(b);
    	Long decimalAns = binaryToDecimal(binaryA) + binaryToDecimal(binaryB);
        return decimalToBinary(decimalAns) + "";
    }
    
    public static Long binaryToDecimal(Long binary) {
    	Long decimal = 0L;
    	Long multiply = 1L;
    	while(binary != 0) {
    		decimal += (binary % 10) * multiply;
    		multiply *= 2;
    		binary /= 10;
    	}
    	return decimal;
    		
    }
    
    public static Long decimalToBinary(Long decimal) {
    	Long binary = 0L;
    	Long temp = 1L;
    	while(decimal != 0) {
    		if(decimal % 2 == 0) {
    			decimal /= 2;
    			temp *= 10;
    			continue;
    		}
    		binary += temp;
    		temp *= 10;
    		decimal /= 2;
    	}
    	return binary;
    }

}
