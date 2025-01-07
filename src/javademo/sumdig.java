package javademo;
import java.util.*;
public class sumdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int p=1;
		while(n>0) {
			int rem=n%10;
			
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);
        
	    n=sc.nextInt();
		while(n>0) {
			int rem=n%10;
			
			p=p*rem;
			n=n/10;
			
		}
		System.out.println(p);
		int sub=p-sum;
		System.out.println(sub);
		
	}

}
