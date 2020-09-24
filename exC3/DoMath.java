public class DoMath {
				
	public static double calcArrayAverage(int[] integerArray) {
	
	double totalForArry = 0;
			
	for (int element: integerArray) {
		totalForArry += element;
	}	
	return totalForArry/integerArray.length;
	}
}