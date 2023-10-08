package WildCatd;
import java.util.ArrayList;

public class TotalNumbers {

	public static void main(String[] args) {
		Number[] numbers = {1,2.4,3,4.1};
		ArrayList<Number>numberList = new ArrayList<Number>();
		for(Number element : numbers)
		{
			numberList.add(element);
		}
		System.out.printf("numberList contains: %s\n", numberList);
		System.out.printf("Total of the elements in numberList: %.1f\n",
				sum(numberList));
		
		System.out.println();
		
		Integer[] integers = {1,2,3,4,5};
		ArrayList<Number>integerList = new ArrayList<Number>();
		for(Integer element : integers)
		{
			integerList.add(element);
		}
		System.out.printf("integerList contains: %s\n", integerList);
		System.out.printf("Total of the elements in integerList: %.0f\n\n",
				sum(integerList));
		
		Double[] doubles = {1.1,2.2,3.3,4.4,5.5};
		ArrayList<Double>doubleList = new ArrayList<Double>();
		for(Double element : doubles)
		{
			doubleList.add(element);
		}
		System.out.printf("doubleList contains: %s\n", doubleList);
		System.out.printf("Total of the elements in doubleList: %.1f\n\n",
				sum(doubleList));
	
	}
	
	public static double sum(ArrayList<? extends Number> list)
	{
		double total=0;
		
		for(Number element : list)
		{
			total+=element.doubleValue();
		}
		return total;
	}

}
