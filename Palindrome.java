// 9.Palindrome no
public class Solution {
	public boolean isPalindrome(int x) {
		int temp=x;
		int rev=0;
		while(temp>0) {
			
			 rev=rev*10+(temp%10);
			 temp/=10;
		}
		if(x==rev) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		Solution b = new Solution();
		System.out.println(b.isPalindrome(121));
	}
}
