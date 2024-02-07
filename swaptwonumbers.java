//6. Write a program to swap two numbers.

import java.util.*;
public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("BEFORE SWAPING------");
        System.out.println("a:-"+a+" b:- "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("AFTER SWAPING-----");
        System.out.println("a:-"+a+" b:- "+b);
    }
}
