package week2.assignment2;

import java.util.Arrays;

public class RemoveDuplicateWords {
public static void main(String[] args) {
	String text="We learn Java basics as part of java sessions in java week1";
	int count=0;
	String str[]=text.split(" ");
	for (int i = 0; i < str.length; i++) {
		for (int j = i+1; j < str.length-1; j++) {
			if(str[i].equalsIgnoreCase(str[j])) {
				str[j]="";
				count++;
			}
		}
	}
		if(count>0) {
			System.out.println("Modified Text : " +Arrays.toString(str));
		
			}
			else { System.out.println(" No duplicates found");
			}
	
			}
	

		
}

