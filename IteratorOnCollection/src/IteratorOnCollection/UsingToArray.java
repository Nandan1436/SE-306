package IteratorOnCollection;
import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray {
	
	public UsingToArray() {
		String colors[] = {"black","blue","white"};
		
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
		
		links.addLast("red");
		links.add("pink");
		links.add(3,"green");
		links.addFirst("cyan");
		
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");
		
		for(String color : colors) {
			System.out.println(color);
		}
		
	}
	
}
