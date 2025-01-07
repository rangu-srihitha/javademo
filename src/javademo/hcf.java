package javademo;
import java.util.*;
import java.util.Scanner;

public class hcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Find the HCF using Euclidean algorithm
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }

        // Output the result
        System.out.println("The HCF is: " + num1);
        
        sc.close();
    }
}
