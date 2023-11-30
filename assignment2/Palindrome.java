package week2.assignment2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=121;
		
		int output=input;
		int n=0;
		while(input>0) {
			
				n=(input%10)+(n*10);
				input=input/10;
				
		}
		if(output==n) 
			System.out.println("Number is palindrom");
		else
				System.out.println("not a palindrome");
		
		

	}

}
