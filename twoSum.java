import java.util.HashMap;
import java.util.Map;

public class twoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length;i++) {
        		int ans = target - nums[i];
        		if(map.containsKey(ans)) {
        			return new int[] {map.get(ans),i};
        		}
        		else
        			map.put(nums[i], i);
        	
        }
		return new int[] {};
    }
	
	public static void main(String[] abc) {
		int[] arr = {2,7,6,0};
		int[] result = twoSum(arr,9);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}
}
