//5. Write a program to print remainder or quotient.

import java.util.*;
public class quotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int devisor=sc.nextInt();
        int rem=number%devisor;
        int quotient=number/devisor;
        System.out.println("Remainder: "+rem);
        System.out.println("Quotient: "+quotient);
    }
}
