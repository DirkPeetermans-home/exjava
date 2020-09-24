import java.util.Scanner;

public class ExB5 {
				
	public static void main(String[] args) {
		
	String answerYN;	
	System.out.println("Welcome!");
	
	do {
		
	Scanner myInput = new Scanner(System.in);
	System.out.println("Would you like to be greeted again? (Y/N)");		
	answerYN = myInput.nextLine();
	
	} while (answerYN.equalsIgnoreCase("Y"));
	
		
	}
}

