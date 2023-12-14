package week4.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] companyNames= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> names=Arrays.asList(companyNames);
		Collections.sort(names);
		//Collections.sort(names,Collections.reverseOrder());
		System.out.println(names);
		
			for (int i = names.size()-1; i>=0; i--) {
				System.out.println(names.get(i));
				
			}
		
		
	}

}
