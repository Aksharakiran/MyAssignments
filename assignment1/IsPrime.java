package assignment1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		int num = 17;
		
			for (int i = 2; i<num; i++) {
				if(num%i==0) {
					System.out.println("not a prime no");
					return;
				}
			}
			System.out.println("num is a prime no");
			
	}
}
