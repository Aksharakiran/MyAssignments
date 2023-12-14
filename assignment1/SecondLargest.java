package week4.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
public static void main(String[] args) {
	int [] array= {3, 2, 11, 4, 6, 7};
	List<Integer> secondLargeNo=new ArrayList<Integer>();
	for (int i = 0; i < array.length; i++) {
		secondLargeNo.add(array[i]);
		Collections.sort(secondLargeNo);
		
	
		
	}
	System.out.println(secondLargeNo.get(4));
}
}
