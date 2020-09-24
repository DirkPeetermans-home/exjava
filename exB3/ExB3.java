public class ExB3 {
				
	public static void main(String[] args) {
	
	double totalForArry = 0;
    int[] integerArray = new int[] {5,7,10,12,20};
	
		
	for (int element: integerArray) {
		totalForArry += element;
	}
	
	System.out.println("Average of array : " + totalForArry/integerArray.length);
	}
}

