package com.hitarth;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Scanner sc = new Scanner(System.in);

     System.out.println("\f");
     Car porsche = new Car();
     System.out.println("Enter car model for manufacturer porsche");
     String s  = sc.nextLine();

     porsche.InputModel(s);
     porsche.Disp();

    }
}
