import java.util.*;
//problem is tricky when it comes to finding without the repeating characters
//for example str = "bbbb", the answer should be 1
 public  class LongestSubstringWithoutRepCharac {
		
	 static int longestSubstr(String s) {
		 
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
		 char[] arr =  s.toCharArray();
		 int i=0, ans=0;
		 for(int j=0;j<s.length();j++) {
			 if(map.containsKey(arr[j]))
				 i = Math.max(map.get(arr[j]),i);
			 
			 ans = Math.max(ans, j-i+1);
			 map.put(arr[j], j+1);
			 
		 }
		 	return ans;	 
	 }
		 
	
	public static void main(String[] abc) {
		LongestSubstringWithoutRepCharac l = new LongestSubstringWithoutRepCharac();
		int ans = l.longestSubstr("abcabcbb");
		System.out.println(ans);
	}
	
}
