package week2.assignment2;

public class TwoArrayComparison {
	/*Declare An array for {3,2,11,4,6,7}; -
	 *  Declare another array for {1,2,8,4,9,7}; 
	 * Declare for loop iterator from 0 to array length - 
	 * Declare a nested for another array from 0 to array length
	 * Compare both the arrays using a conditional statement. -
	 *  Print the value from first array when there is a match 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
				
			}
			
		}

	}

}
