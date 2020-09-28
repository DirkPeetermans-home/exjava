import java.io.IOException;
public class Test {
	
	public static void main(String[] args) {
		
		try {
		
		Instructor Instr1 = new Instructor("Dirk","Peetermans",52, 20,2000.5);
		Instr1.printSalaryHistory();
		
		Instructor Instr2 = new Instructor("Chri","Vr",50, 20,2000.5);
		Instr2.printSalaryHistory();
		
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
	}
}