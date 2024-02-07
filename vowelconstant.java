//8. Write a program to check weather the aplhabet is vowel or constant.

import java.util.*;
public class vowelconstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int alphabet='c';
        int vowels[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<vowels.length;i++){
            if(vowels[i]==alphabet){
                System.out.println("The alphabet is VOWEL");
                break;
            }
            else{
                System.out.println("The aplhabet is CONSTANT");
                break;
            }
        }
    }
}
