package programs.String;

public class RecerseAStringByStringBuilder {

	public static void main(String[] args) {

		String str = "Madam";

		// StringBuilder sbRev = new StringBuilder(str).reverse();
		// System.out.println("Reverse of the given string is: >>> " + sbRev);

		
		// if we want to check whether given string is Palindrome or not
		String sbRev = new StringBuilder(str).reverse().toString();

		System.out.println("Reverse of the given string is: >>> " + sbRev + "\n");
		System.out.println("Is Palindrome: >>> " + str.equalsIgnoreCase(sbRev));

	}

}
