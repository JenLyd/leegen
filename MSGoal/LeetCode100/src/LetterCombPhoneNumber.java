
import java.util.*;
/*Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].*/
public class LetterCombPhoneNumber {

	public static List<String> letterComb(String str) {
		
		
		String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		LinkedList<String> list = new LinkedList<String>();
		
		if(str.isEmpty())
			return list;
		
		list.add("");
		for(int i=0;i<str.length();i++) {
			int x = Character.getNumericValue(str.charAt(i));
			
			while(list.peek().length()==i) {
			
				String t = list.remove();
				for(char c : map[x].toCharArray()) {
					list.add(t+c);
				}
			}
		}
		return list;
	}
	
	/*public class Solution {
    	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    	public List<String> letterCombinations(String digits) {
    		List<String> ret = new LinkedList<String>();
    		combination("", digits, 0, ret);
    		return ret;
    	}
    
    	private void combination(String prefix, String digits, int offset, List<String> ret) {
    		if (offset >= digits.length()) {
    			ret.add(prefix);
    			return;
    		}
    		String letters = KEYS[(digits.charAt(offset) - '0')];
    		for (int i = 0; i < letters.length(); i++) {
    			combination(prefix + letters.charAt(i), digits, offset + 1, ret);
    		}
    	}
    }*/
	
	public static void main(String[] abc) {
	
		List<String> ans = letterComb("234");
		System.out.println(ans);
	}
}
