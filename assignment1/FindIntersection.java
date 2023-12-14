package week4.assignment1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		int [] array1= {3, 2, 11, 4, 6, 7};
		int [] array2={1, 2, 8, 4, 9, 7};
		int values;
		List<Integer> nums=new ArrayList<Integer>();
		for (int i = 0; i < array1.length; i++) {
			for (int k = 0; k < array2.length; k++) {
				
				if(array1[i]==array2[k]) {
					nums.add(array1[i]);
					
			}
				
				
			}
					}
			
		System.out.println(nums);
	}
}
