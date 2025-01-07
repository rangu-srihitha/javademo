package javademo;
import java.util.*;
public class inputssum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		
		while(true) {
			
			int b=sc.nextInt();
			if(b==0) {
				break;
			}
			sum=sum+b;
			
			
			
		}
		System.out.print(sum);
	}

}
