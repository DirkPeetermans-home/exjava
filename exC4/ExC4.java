import java.util.Scanner;

public class ExC4 {
				
	public static void main(String[] args) {
		
		
	System.out.println("Welcome!");
	
	requestInput();
			
	}
	
	private static void requestInput() {
		
			String answerYN = "Y";	
			Scanner myInput = new Scanner(System.in);
			System.out.println("Would you like to be greeted again? (Y/N)");		
			answerYN = myInput.nextLine();
			
			if (answerYN.equalsIgnoreCase("Y")) {
				requestInput();
			}
	
		
	}
}

