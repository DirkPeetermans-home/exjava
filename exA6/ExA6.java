import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ExA6 {
				
	public static void main(String[] args) {
		
	Scanner myInput = new Scanner(System.in);	
	
	 Map<String,Integer> myCalendar = new HashMap <String,Integer>();
	 
	 myCalendar.put("January",31);
	 myCalendar.put("February",28);
	 myCalendar.put("March",31);
	 myCalendar.put("April",30);
	 myCalendar.put("May",31);
	 myCalendar.put("June",30);
	 myCalendar.put("July",31);
	 myCalendar.put("August",31);
	 myCalendar.put("September",30);
	 myCalendar.put("October",31);
	 myCalendar.put("November",30);
	 myCalendar.put("December",31);
	 
	System.out.println("Enter month : ");		
	String month = myInput.nextLine();
	 
	System.out.println("Enter day : ");		
	int day = Integer.parseInt(myInput.nextLine());
	
	int daysToGO = myCalendar.get(month) - day;
	 
	System.out.println("Days to go : " + daysToGO);
	
	}
	
}

