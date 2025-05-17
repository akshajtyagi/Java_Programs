package programs.Number;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int num = 1221;
		int orignalNum =num;
		int rev = 0;
		
		while(num!=0) {
			
		rev = rev*10 + num%10;
		num = num/10;
		}
		if(orignalNum==rev) {
			System.out.println(rev +" >>> Number is Palindrome");
		}else {
			System.out.println(rev +" >>> Number is not a Palindrome number");
		}
	}

}
