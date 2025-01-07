package javademo;
import java.util.*;
public class prime {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		boolean isprime=true;
		for (int i = 2; i < a; i++) {
		    if (a % i == 0) {
		        System.out.print("not prime");
		       isprime=false;
		        break;
		    }
		    }
		if(isprime) {
			System.out.print("prime");
		}
		
		    
		}
		
			
			
		
		
		
		
	}


