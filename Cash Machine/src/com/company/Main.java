package com.company;
import javax.print.DocFlavor;
import java.net.SocketOption;
import java.util.Scanner;


public class Main {

    public static int balance = 2400;
    public static int pincode = 1234;
    public static int usercode = 0;


    public static void main(String[] args) {
        // write your code here
        int trys = 0;

        Scanner number_input = new Scanner(System.in);
        while (usercode != pincode) {
            System.out.println("That code is correct, please try again.");
            System.out.println("PLease enter your pin");
            usercode = number_input.nextInt();
            trys++;
            if (trys == 3) {
                System.out.println("Too many attwmpts. Your account has been locked");
            }
            if (usercode == pincode) {
                menu();
            }
        }
    }
    public static void menu() {
        int menuchoice = 0;

        System.out.println("--------------------------------");
        System.out.println("Welcome To The Bank");
        System.out.println("(1) Display Balance");
        System.out.println("(2) Deposit Money Into Account");
        System.out.println("(3) Withdraw Money From Account");
        System.out.println("(4) Logout Of Your Account");
        System.out.println("--------------------------------");

        Scanner number_input = new Scanner(System.in);
        System.out.println("PLease select an ooption:");
        menuchoice = number_input.nextInt();

        switch (menuchoice) {
            case 1:
                balance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank You For Banking With Us");
                break;
            default:
                menu();

        }
    }
        public static void balance() {
            System.out.println("Your Balance is " + balance);
            menu();
        }
        public static void deposit() {
            int deposit = 0;

            System.out.println("How Much Would You Like To Deposit");
            Scanner number_input = new Scanner (System.in);
            deposit = number_input.nextInt();

            balance = deposit + balance;
            balance();
    }
    public static void withdraw() {
        int withdraw = 0;

        System.out.println("How Much Would You Like To Withdraw?");
        Scanner number_input = new Scanner (System.in);
        withdraw = number_input.nextInt();

        if (withdraw < balance)
        {
            balance = balance - withdraw;
            balance();
        }
        else
        {
            System.out.println("Insufficient Funds");
           menu();
        }
    }
}