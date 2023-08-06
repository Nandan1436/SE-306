package List;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListTest {
	private static final int num[]= {1,8,4,11,0,2,1};
	
	public ListTest() {
		List<Integer>list=new ArrayList<Integer>();
		for(int x : num) {
			list.add(x);
		}
		System.out.println("Original list: ");
		printList(list);
		
		//Sort
		Collections.sort(list);
		System.out.println("Sorted list: ");
		printList(list);
		
		//Binary Search
		System.out.println("Finding 4 in the list: ");
		int index=Collections.binarySearch(list,4);
		System.out.printf("4 found at position %d\n",index);
		System.out.println("Finding 5 in the list: ");
		index=Collections.binarySearch(list, 5);
		System.out.print(index);
		System.out.println(" ,therefore not found.");
		
		//Reverse
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println("Reversed list: ");
		printList(list);
		
		//Shuffle
		Collections.shuffle(list);
		System.out.println("Shuffled list: ");
		printList(list);
		
		//Fill
//		Collections.fill(list, 3);
//		System.out.println("List after filled with 3: ");
//		printList(list);
		
		//Find minimum
		int minimum=Collections.min(list);
		System.out.println("Minimum element in the list: "+minimum);
		
		//Find maximum
		int maximum=Collections.max(list);
		System.out.println("Maximum element in the list: "+maximum);
		
		//Find frequency
		int freq=Collections.frequency(list, 1);
		System.out.println("Frequency of 1 in the list: "+freq);
		
		//addAll
		List<Integer>list2=new ArrayList<Integer>();
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list.addAll(list2);
		System.out.println("New list after appending another one to it: ");
		printList(list);
		
		//Disjoint
		List<Integer>list3=new ArrayList<Integer>();
		list3.add(100);
		list3.add(400);
		List<Integer>list4=new ArrayList<Integer>(2);
		list4.add(1);
		list4.add(150);
		System.out.println("is list1 and list3 disjoint: " + Collections.disjoint(list, list3));
		System.out.println("is list1 and list4 disjoint: "+ Collections.disjoint(list, list4));
		
		//Copy
		List<Integer>copyList=new ArrayList<Integer>(20);
		copyList.add(1);
		copyList.add(2);
		Collections.copy(copyList,list4);
		System.out.println("Copied list: ");
		printList(copyList);
		
	}
	
	void printList(List<Integer> list) {
		System.out.println(list);
	}
	
}
