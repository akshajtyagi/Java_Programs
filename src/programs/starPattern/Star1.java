package programs.starPattern;

public class Star1 {

	public static void main(String[] args) {
		
/* example
		*
		**
		***
		****
		*****
				*/
		
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
	
}
