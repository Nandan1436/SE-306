package Array;

public class MyMain {

	public static void main(String[] args) {
		UsingArrays list = new UsingArrays();
	
		for(int x : list.getIntArray()) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x : list.getIntArrayCopy()) {
			System.out.print(x+ " ");
		}
		System.out.println();
		for(double x : list.getDoubleArray()) {
			System.out.print(x+ " ");
		}
		System.out.println();

	}
	

}
