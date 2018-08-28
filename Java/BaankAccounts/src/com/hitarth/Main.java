package com.hitarth;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc =new Scanner(System.in);
        String s="";
        do {
                Accounts a = new Accounts();
                a.enterDetailsToContinue();
                System.out.println("Enter \'EXIT\' to exit. Press any other key to register new customer and proceed to menu");
                s = sc.nextLine();
        }while(s!="EXIT");
    }

}
