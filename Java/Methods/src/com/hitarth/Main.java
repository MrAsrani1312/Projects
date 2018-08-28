package com.hitarth;
import java.util.*; // Importing java.util for Scanner class for input

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in); //Using the scanner wrapper class for input
        int a,b;

        System.out.println("Enter 2 numbers ");
        a= sc.nextInt();
        b= sc.nextInt();

        add(a,b);
    }

    public static void add(int x, int y) {
        int z= x+y;
        System.out.println("The sum is : "+ z);
    }
}
