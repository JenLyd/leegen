
public class atoi {

	public static int myAtoi(String s) {
		
		char[] arr = s.toCharArray();
		int i=0, total = 0;
		int sign = 1;
		
		s = s.trim();
		 if(s.length()==0)
	          return 0;
		
		while(arr[i]== ' ' && i < arr.length)
			i++;
		if(i==arr.length)
			return 0;
		if(arr[i] == '+' || arr[i] == '-') {
			sign = arr[i] == '+' ? 1:-1;
			i++;
		}
		
		while(i<arr.length) {
			
			int digit = arr[i] - '0';
			if(digit<0 || digit>9)
				break;
			//check if total will be overflow after 10 times and add digit
	        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
	            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	        
	        total = 10*total + digit;
	        i++;
		}
		
		return total * sign;
		
	}
	
	public static void main(String[] abc) {
		
		atoi a = new atoi();
		int ans = a.myAtoi("1");
		System.out.println(ans);
	}
}
