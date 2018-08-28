package com.hitarth;
import java.util.*;

public class Main {

    public static void main(String[] Args){
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int ch=0;

        System.out.println("\f");
        System.out.println("Enter a number to be checked");
        int x = sc.nextInt();

        System.out.println("Press 1 to check for Perfect Number");
        System.out.println("Press 2 to check for Special Number");
        ch = sc.nextInt();

        switch(ch)
        {
            case 1: perfect(x);
                    break;

            case 2: special(x);
                    break;

            default : System.out.println("Invalid option. Please try again.");
                      menu();
        }
    }

    public static void perfect(int a){
           int s=0;
           for (int i=1;i<a;i++){
               if(a%i==0) {
                   s += i;//Sum of divisors
                   //error checking , check 's'  System.out.println("Sum is : "+s);
               }
           }
           if (s==a)
               System.out.println("Number entered is a perfect number");
           else
               System.out.println("Number entered is imperfect");
    }

    public static void special(int a){
            int s=0,f=1,d=0,b=a;
            //example 145
            while(a!=0)
            {
                d=a%10; //1st digit , 5(run #1)
                for (int i=1;i<=d;i++)
                {   f=f*i; //factorial of digit
                }
                a=a/10; //rest of the number, 14
                s+=f; // add to sum
                f=1; //reset factorial
            }
            if (b==s)
            {       System.out.println("Numbeer entered is special.");
            }
            else {  System.out.println("Number enteredd is not so special.");
            }
    }
}
