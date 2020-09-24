import java.util.Scanner;
public class ExB4 {
				
	public static void main(String[] args) {
	
	Scanner myInput = new Scanner(System.in);
	System.out.println("Which language code : ");		
	String languageCode = myInput.nextLine();
	
	switch (languageCode) {
		case "NL":
		System.out.println("Goeiedag!");
		break;
		case "FR":
		System.out.println("Bonjour!");
		break;
		case "EN":
		System.out.println("Good day!");
		break;
		default:
		System.out.println("Goeiedag, bonjour and good day!");
	}
	
		}
}

