import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExF1 {
				
	public static void main(String[] args) {
		
	Scanner myInput = new Scanner(System.in);
	double totalPrice;
	String cheapOrExpensive;
	int numberOfDays = 0;
	double pricePerDay = 0;
	boolean daysOK = false;
	
	System.out.println("Enter course title : ");		
	String title = myInput.nextLine();
	 
		
	while (!daysOK) {
	try {
		System.out.println("Course duration : ");
		numberOfDays = Integer.parseInt(myInput.nextLine());
		daysOK = true;
	} catch (NumberFormatException e) {
		System.out.println("Please enter an Integer value here");	
		}	
	}
	
	daysOK = false;
	
	while (!daysOK) {		
	try {
		System.out.println("Price per day : ");
		pricePerDay = Double.parseDouble(myInput.nextLine());
		daysOK = true;
	} catch (NumberFormatException e) {
		System.out.println("Please enter an Double/Interger value here");
			}
	}
		 
	 boolean priorKnowledgeReq = true;
	 
	 //Read instructors from file and put them in an Arraylist
	 
	 List<String> instructorList = new ArrayList<String>();
	 BufferedReader br = null;
	 
	 try {
		 br = new BufferedReader(new FileReader("instructors.txt"));
		 String lineFromFile = br.readLine();
	 while (lineFromFile != null) {
		 instructorList.add(lineFromFile);
		 lineFromFile = br.readLine();
	 }
	 } catch (IOException ioe) {
		 System.out.println("Problem with file :" + ioe);
		 System.exit(0);
	 }
	
	  
	  
		 
	 printInfo(title, numberOfDays, pricePerDay, priorKnowledgeReq, instructorList, totalPriceCalc(numberOfDays,priorKnowledgeReq, pricePerDay));
	 
	
	}
	
	private static double totalPriceCalc(int numberOfDays, boolean priorKnowledgeReq, double pricePerDay) {
		double totalPrice=numberOfDays * pricePerDay;
		if (!(numberOfDays > 3 && priorKnowledgeReq )) {
		 totalPrice*=1.21;
		}
		return totalPrice;
		
	}
	
	private static void printInfo(String title, int numberOfDays, double pricePerDay, boolean priorKnowledgeReq, List instructorList, double totalPrice) {
	System.out.println("Course title: " + title + " \r\nCourse duration: " + numberOfDays + "\r\nPrice per day: " + pricePerDay + "\r\nPrior knowledge needed: " + priorKnowledgeReq);
	System.out.println("There are " + instructorList.size() + " instructors for this course.") ;
	System.out.println("The total price is : " + totalPrice);
}
}
