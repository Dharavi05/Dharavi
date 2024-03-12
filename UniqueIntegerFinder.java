package assign_5;

public class UniqueIntegerFinder {


	    public static int findUniqueInteger(int[] nums) {
	        int result = 0;
	        
	        for (int num : nums) {
	            result ^= num; // XOR operation
	        }
	        
	        return result;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {2, 3, 4, 3, 2}; // Example array
	        int uniqueInteger = findUniqueInteger(nums);
	        System.out.println("The unique integer is: " + uniqueInteger);
	    }
	}

