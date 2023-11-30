package week2.assignment2;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "changeme";
		char [] ch=test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i%2!=0) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
			
		}
		System.out.println(ch);

	}

}
