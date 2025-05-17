package programs.Number;

public class CountNumberOfDigitsInANumber {
	public static void main(String[] args) {

		int num = 1234567;
		
		int numCount = 0;
		
		while(num!=0) {
			
			num =num/10;
			numCount++;
		}
		
		System.out.println("Number of digits in the given number is: >>> "+numCount);
		
		
	}
}
