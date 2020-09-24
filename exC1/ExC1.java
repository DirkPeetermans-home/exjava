import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExC1 {
				
	public static void main(String[] args) {
		
	Scanner myInput = new Scanner(System.in);
	double totalPrice;
	String cheapOrExpensive;
	
	System.out.println("Enter course title : ");		
	String title = myInput.nextLine();
	 
	System.out.println("Course duration : ");		
	int numberOfDays = Integer.parseInt(myInput.nextLine());
	
	System.out.println("Price per day : ");		
	double pricePerDay = Double.parseDouble(myInput.nextLine());	
		 
	 boolean priorKnowledgeReq = true;
	 
	 List<String> instructorList = new ArrayList<String>();
	 instructorList.add("Sandy Schillebeeckx");
	 instructorList.add("xxxx yyyyy");
	 
	 if (numberOfDays > 3 && priorKnowledgeReq ) {
		 totalPrice = (numberOfDays * pricePerDay);
	 }
	 else {
		 totalPrice = (numberOfDays * pricePerDay * 1.21);
	 }
	 
	 if (totalPrice < 500) {
	    cheapOrExpensive = "CHEAP";
	 }
	 else if (totalPrice >= 500 && totalPrice <= 1500) {
		 cheapOrExpensive = "OK";
	 }
	 else {
		cheapOrExpensive = "Expensive";
	 }
	 
	 printInfo(title, numberOfDays, pricePerDay, priorKnowledgeReq, instructorList);
	 
	
	}
	
	private static void printInfo(String title, int numberOfDays, double pricePerDay, boolean priorKnowledgeReq, List instructorList) {
	System.out.println("Course title: " + title + " \r\nCourse duration: " + numberOfDays + "\r\nPrice per day: " + pricePerDay + "\r\nPrior knowledge needed: " + priorKnowledgeReq);
	System.out.println("There are " + instructorList.size() + " instructors for this course.") ;
	
}
}
