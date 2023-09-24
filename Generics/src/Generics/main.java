package Generics;

public class main {
//	public static void printArray(Integer[] inputArray)
//	{
//		for(Integer element : inputArray)
//			System.out.printf("%s ",element);
//		System.out.println();
//	}
//	
//	public static void printArray(Double[] inputArray)
//	{
//		for(Double element : inputArray)
//			System.out.printf("%s ",element);
//		System.out.println();
//	}
//	
//	public static void printArray(Character[] inputArray)
//	{
//		for(Character element : inputArray)
//			System.out.printf("%s ",element);
//		System.out.println();
//	}
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E element : inputArray)
			System.out.printf("%s ",element);
		System.out.println();
	}
	
//	public static <T extends Comparable < T > > T maximum(T x, T y, T z)
//	{
//		T max = x;
//		if(y.compareTo(max)>0)max=y;
//		if(z.compareTo(max)>0)max=z;
//		
//		return max;
//	}
	
	public static Comparable maximum(Comparable x, Comparable y, Comparable z)
	{
		Comparable max = x;
		if(y.compareTo(max)>0)max=y;
		if(z.compareTo(max)>0)max=z;
		
		return max;
	}
	
	public static void main(String[] args) {
		Integer[] integerArray = {1,2,3,4,5,6};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6};
		Character[] characterArray = {'H','E','L','L','O'};
		System.out.println("Array integerArray contains: ");
		printArray(integerArray);
		System.out.println("Array doubleArray contains: ");
		printArray(doubleArray);
		System.out.println("Array characterArray contains: ");
		printArray(characterArray);
		System.out.println();
		
		System.out.printf("Maximum of %d %d and %d is %d\n",3,4,5,maximum(3,4,5));
		System.out.printf("Maximum of %.1f %.1f and %.1f is %.1f\n",3.3,4.4,5.5,maximum(3.3,4.4,5.5));
		System.out.printf("Maximum of %s %s and %s is %s\n","pear","apple","fox",maximum("pear","apple","fox"));

	}

}
