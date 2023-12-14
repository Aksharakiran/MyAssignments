package week4.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {
public static void main(String[] args) {
	int array[]={1, 2, 3, 4, 10, 6, 8};
	List<Integer> values=new ArrayList<Integer>();
	int ch = 0;int start=0;
	for (int i = 0; i < array.length; i++) {
		values.add(array[i]);
		Collections.sort(values);
	}
	for (int j = 0; j < values.size(); j++) {
		ch=ch+1;
		if(values.get(start)!=ch) {
			System.out.println(+ch);
			start=start+0;
		}
		else {
			start=start+1;
		}
	}
	}
	
}

