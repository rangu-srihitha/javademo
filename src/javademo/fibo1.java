package javademo;
import java.util.Scanner;
public class fibo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		
		int count = 0;
		while(count<=n) {
			int temp=b;
			b=b+a;
			
			a=temp;
			count ++;
			
			System.out.print(b);	
		
		}
		

	}

}

