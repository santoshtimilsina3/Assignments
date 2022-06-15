/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.controller;

import java.util.Scanner;

public class MainController {

    static Scanner scanner = new Scanner(System.in);
   

    public static void main(String... args) {
        while (true) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("press 1. All common records from Account and Receipt table");
            System.out.println("press 2. All records from Account that do not exist in Reciept table");
            System.out.println("press 3. All common records from Account and Receipt table");
            System.out.println("press 4. Get all table");
            System.out.println("press 0 : To exit");
            System.out.println("--------------------------------------------------------------------");
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    new CommonRecords().appendAndPrint();
                    break;
                case 2:
                    new AccountOnly().appendAndPrint();
                    break;
                case 3:
                    new ReceiptOnly().appendAndPrint();
                    break;
                case 4:
                    new AllRecords().appendAndPrint();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter the valid input ");
            }

        }
    }

}
