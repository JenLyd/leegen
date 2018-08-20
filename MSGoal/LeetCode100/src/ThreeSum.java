import java.util.*;

public class ThreeSum {

	
	public static List<List<Integer>> threeSum(int[] arr){
		
		int n = arr.length;
		
		int sum;
		Arrays.sort(arr);
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>(); 
		for(int i=0;i<n-2;i++) {
			
			if(i==0 || (i>0 && arr[i]!=arr[i-1])) {
				int low = i+1;
				int high = n-1;
				System.out.println("low = "+ low +"high = "+high);
			while(low<high) {
				sum = arr[i]+arr[low]+arr[high];
					if(sum==0) {
					result.add(Arrays.asList(arr[i],arr[low],arr[high]));
					while (low < high && arr[low] == arr[low+1]) low++;
                    while (low < high && arr[high] == arr[high-1]) high--;
					low++;
					high--;
				}
				else if(sum>0) {
					high--;
				}
				else {
					low++;
				}
			}
		}
		}
		return result;
	}
	
	public static void main(String[] abc) {
		
		int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		List<List<Integer>> ans = threeSum(nums);
		System.out.println(ans);
	}
}
