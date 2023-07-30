package IteratorOnCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collection;

public class MyMain {

	public static void main(String[] args) {
		List<String>num= new ArrayList<>();
		num.add("Nandan");
		num.add("Ismail");
		num.add("Protta");
		
		ListIterator<String> iterator = num.listIterator();
		
		//num.add(3);

		while(iterator.hasNext()) {
			String temp = iterator.next();
			temp=temp.toUpperCase();
			iterator.set(temp);
			System.out.println(temp);
		}
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		new ListTest();
		new UsingToArray();
		
	}

}
