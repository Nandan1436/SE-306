package VectorsAndCollectionTest;
import java.util.Vector;
import java.util.Collections;
import java.util.NoSuchElementException;

public class VectorTest {
	private static final String colors[]= {"red","white","blue"};
	
	public VectorTest() {
		Vector<String>vector=new Vector<String>();
		printVector(vector);
		
		for(String color : colors) {
			vector.add(color);
		}
		printVector(vector);
		Collections.sort(vector);
		printVector(vector);
	}
	
	void printVector(Vector<String> vector) {
		for(String color : vector) {
			System.out.printf("%s ",color);
		}
	}
}
