package com.hitarth;
import java.io.*;
import java.util.*;

public class Accounts {
   private long[] AccNo = new long[100];
   private long[] Num= new long[100];  //, add phone number feature
   private String[] Name = new String[100];
   private long[] balance = new long[100];
   private int i=0;

   Scanner sc = new Scanner(System.in);

   Accounts() //default constructor
   {
       int i=this.i;
       System.out.println("Current array num : "+ i);
       balance[i]= 50000;
       System.out.println("Enter Customer name");
       Name[i] = sc.nextLine();

       System.out.println("Enter account number");
       AccNo[i]=sc.nextLong();

       this.i++;
   }

   public void menu() {
       System.out.println("*****WELCOME TO jAVA BANK*****");
       System.out.println("Press 1 to Deposit cash");
       System.out.println("Press 2 to Withdraw cash");
       System.out.println("Press 3 to check balance");
       System.out.println("Press 0 to exit");
       int ch = sc.nextInt();

       switch (ch) {
           case 0:
               System.exit(0);
               break;

           case 1:
               deposit();
               break;

           case 2:
               withdraw();
               break;

           case 3:
               CheckBalance();
               break;

           default: System.out.println("Invalid option , please try again");
                    menu();
       }
   }

   public void deposit(){
        System.out.println("WELCOME TO THE DEPOSIT SCREEN");
        System.out.println("Enter amount needed to deposit. Max $ 150,000.");

        long amtDep = sc.nextLong();
        balance[i]+=amtDep;

        System.out.println("Transaction Successful. Current Balance :  $"+ balance[i]);
   }

    public void withdraw(){
        System.out.println("WELCOME TO THE WITHDRAWAL SCREEN");
        System.out.println("Enter amount needed to withdraw. Max $"+balance[i]);

        long amtWithdraw = sc.nextLong();
        balance[i]-=amtWithdraw;

        System.out.println("Transaction Successful. Current Balance :  $"+ balance[i]);
    }

    public void CheckBalance(){
        System.out.println("Current Balance : " + balance[i]);
    }

    public void enterPhoneNumber(int i){
        System.out.println("Enter your phone number");
        Num[i]= sc.nextLong();

        String t = new  Long(Num[i]).toString();
        if(t.length() == 10)
        {
            menu();//method here
        }
        else
        {   System.out.println("Number length should be 10 digits, Please try again");
            enterPhoneNumber(i);
        }
    }

    public void enterDetailsToContinue(){
            System.out.println("*****WELCOME TO jAVA BANK*****");
            System.out.println("******************************");
            System.out.println("Enter account number to continue");
            long accNumEntered = sc.nextLong();

            for(int i=0;i<=this.i;i++)
            {
                if(AccNo[i] == accNumEntered)
                {   //Add customer name
                    System.out.println("Welcome , "+Name[i]);
                   enterPhoneNumber(i);
                   break;
                }
                else
                {
                    System.out.println("Account not found... :( ");
                    System.out.println("Press Enter to exit.");
                    System.exit(0);
                }
                System.out.println("Thanks for using jAVA BANK, we hope to see you again :)");

            }
   }

}