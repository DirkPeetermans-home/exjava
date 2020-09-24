import java.util.ArrayList;
import java.util.List;

public class ExA4 {
				
	public static void main(String[] args) {
		
	 String title= args[0];
	 int numberOfDays = Integer.parseInt(args[1]);
	 double pricePerDay = Double.parseDouble(args[2]);
	 boolean priorKnowledgeReq = true;
	 List<String> instructorList = new ArrayList<String>();
	 double totalPrice = (numberOfDays * pricePerDay * 1.21);
	 
	 instructorList.add("Sandy Schillebeeckx");
	 instructorList.add("xxxx yyyyy");
		
	System.out.println("Course title: " + title + " \r\nCourse duration: " + numberOfDays + "\r\nPrice per day: " + pricePerDay + "\r\nPrior knowledge needed: " + priorKnowledgeReq);
	System.out.println("There are " + instructorList.size() + " instructors for this course.") ;
	System.out.println("The total price of the course is : " + totalPrice + " Euro, tav included");
	
	}
	
}

