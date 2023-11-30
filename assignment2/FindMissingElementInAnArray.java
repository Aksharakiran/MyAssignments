package week2.assignment2;

import java.util.Arrays;

public class FindMissingElementInAnArray {
public static void main(String[] args) {
	int input[]={1, 4,3,2,8, 6, 7};
	Arrays.sort(input);
	int i=0;
	int highVal=input[input.length-1];
	for (int j = 1; j <= highVal ; j++) {
		
			if(input[i]!=j) {
				System.out.println("The missing number is" +j);
			}
			else {
				i=i+1;
			}
		
	
	}
}
}
