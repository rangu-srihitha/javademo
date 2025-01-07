package javademo;


public class srihitha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "12321";
		
		int n = s1.length();
		int n1 =n;
		if(n%2 !=0) {
			n = (n-1)/2;
		}
		else {
			n = n/2;
		}

		int c = 0;
		for(int i =0;i<n;i++) {
			if (s1.charAt(i) != s1.charAt(n1-i-1)) {
				c = 1;
				break;
			}
			
		}
		if (c == 0) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not pallindrome");

		}
	}


}
