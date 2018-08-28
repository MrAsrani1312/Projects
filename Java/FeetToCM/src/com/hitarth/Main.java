package com.hitarth;
import java.util.*;

public class Main {


    public static void main(String[] Args){
        menu();
    }

    public static void menu() {
    	Scanner sc = new Scanner(System.in);

	    double ft,cm,inch;

    	System.out.println("***Enter length in FEET and INCHES and get length in cm***");
    	System.out.println("Enter length in feet");
	    ft = sc.nextDouble();

	    System.out.println("Enter length in inches ");
        inch =  sc.nextDouble();

        if (ft<0 || (inch<0 && inch>12  ) )
        {
        System.out.println("ERROR incorrect values entered , Please try again.");
        menu();
        }
        else{
            calcFeetAndInchesToCm(ft , inch);
        }
    }

    public static void calcFeetAndInchesToCm(double f , double i){
        double c_f , c_in =0;

        c_f = f/0.032808;
        c_in = i *2.54;

        System.out.println("Feet to cm : "+ c_f);
        System.out.println("Inches to cm : " + c_in);
    }
}
