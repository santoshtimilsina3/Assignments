/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.controller;

import com.santosh.repository.Html;
import com.santosh.repository.JdbcOperation;
import java.util.Scanner;

public class MainController {

    static Scanner scanner = new Scanner(System.in);
    static JdbcOperation jdbc = new JdbcOperation();
   static Html html=new Html();

    public static void main(String... args)  {
        System.out.println("Type YES to get :-");
        System.out.println("1. All common records from Account and Receipt table");
        System.out.println("2. All records from Account that do not exist in Reciept table");
        System.out.println("3. All common records from Account and Receipt table");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            jdbc.commonRecords();
            jdbc.onlyAccountRecords();
            jdbc.onlyReceiptRecords();
        }

    }

}
