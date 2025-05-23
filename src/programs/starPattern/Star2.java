package programs.starPattern;

public class Star2 {
	
	public static void main(String[] args) {
		
/* example
		*****
		****
		***
		**
		*
	*/
		
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			for(int j=i; j<=row; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
