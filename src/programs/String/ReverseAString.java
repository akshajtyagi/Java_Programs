package programs.String;

public class ReverseAString {
	
	// reverse a string without using inbuilt method
	
	public static void main(String[] args) {
		
		String str = "MadaM";
		String rev = "";
		
		for (int i =str.length()-1; i>=0; i--) {
			
			rev = rev+	str.charAt(i);
		}
		
		System.out.println("Reverese of the given String is: >>> " +rev + "\n");
		
		if(str.equalsIgnoreCase(rev)) {
			
			System.out.println("It is a Palindrome String");
		}else {
			
			System.out.println("It is Not a Palindrome String");
		}
		
	}
	

}
