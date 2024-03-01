package com.mycompany.bankapp;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("    ************** Welcome To Our Bank Management Software **************\n");
        Bank bank = new Bank();
        while (true) {
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            /**
             * ****************************************************************************************
             */
            System.out.println("\t\t ****************************");
            System.out.println("\t\t\t 1) Employee");
            System.out.println("\t\t\t 2) Customer ");
            System.out.println("\t\t\t 3) Exit ");
            System.out.println("\t\t ****************************");
            System.out.println("Enter a Number :");
            int inpt6 = s.nextInt();
            /**
             * ******************************************************
             */
            if (inpt6 == 1) {

                System.out.println("Enter Pin :");
                int inpt5 = s.nextInt();

                if (inpt5 == 123) {
                    boolean t = true;
                    while (t) {
                        System.out.println("\t ------------------------------");
                        System.out.println("\t\t 1) Show Information");
                        System.out.println("\t\t 2) Add Account ");
                        System.out.println("\t\t 3) Delete Account");
                        System.out.println("\t\t 4) Exit");
                        System.out.println("\t ------------------------------");
                        System.out.println("Enter your choice : ");
                        int inpt = s.nextInt();
                        if (inpt == 1) {
                            for (Account a : bank.accList) {
                                // a.showInfo();
                                System.out.println("\t *********************************");
                                System.out.println("\t\t Name: " + a.getName()
                                        + "\n\t\t Acc#: " + a.getAccNumber()
                                        + "\n\t\t Balance: " + a.getBalance()
                                        + "\n\t\t Rate: " + a.getRate() + "%"
                                        + "\n\t\t Accrued Interest: $" + a.getAccruedInterest() + "\n");
                                System.out.println("\t *********************************");
                            }
                        } else if (inpt == 2) {
                            bank.addAccount();
                        } else if (inpt == 3) {
                            bank.deleteAccount();
                        } else if (inpt == 4) {

                            break;

                        } else {
                            System.out.println("!!!!!!!!!!Invaled value!!!!!!!!!!!!");
                        }
                    }
                } else {
                    System.out.println("!!!!!!!!!!Invaled value!!!!!!!!!!!!");

                }
            } /**
             * ***************************************************************************************
             */
            else if (inpt6 == 2) {
                System.out.println("Enter Pin :");
                int inpt7 = s.nextInt();

                if (inpt7 == 201014) {
                    while (true) {
                        System.out.println("\t ------------------------------");
                        System.out.println("\t\t 1.Deposit\n\t\t 2.Withdraw\n\t\t 3.Transfer\n\t\t 4.Exit");
                        System.out.println("\t ------------------------------");
                        int inpt3 = s.nextInt();
                        if (inpt3 == 1) {
                            System.out.println("Account number");
                            String inpt1 = s1.nextLine();
                            System.out.println("Amount to deposite");
                            double inpt2 = s2.nextDouble();
                            bank.deposit(inpt1, inpt2);
                        } else if (inpt3 == 2) {
                            System.out.println("Account number");
                            String inpt1 = s1.nextLine();
                            System.out.println("Amount to withdraw");
                            double inpt2 = s2.nextDouble();
                            bank.withdraw(inpt1, inpt2);
                        } else if (inpt3 == 3) {
                            System.out.println("From which account number");
                            String inpt1 = s1.nextLine();
                            System.out.println("To which account number");
                            String inpt2 = s1.nextLine();
                            System.out.println("Amount to transfer");
                            double inpt4 = s2.nextDouble();
                            bank.transfer(inpt1, inpt2, inpt4);
                        } else if (inpt3 == 4) {
                            break;

                        } else {
                            System.out.println("!!!!!!!!!!Invaled value!!!!!!!!!!!!");
                        }
                    }
                } else {
                    System.out.println("!!!!!!!!!!Invaled value!!!!!!!!!!!!");

                }
            } else {
                System.exit(0);
            }
        }
    }

}
