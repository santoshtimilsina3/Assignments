/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.controller;

import com.santosh.repository.FileOperation;
import com.santosh.repository.JdbcOperation;
import java.util.ArrayList;
import java.util.List;


public class DataFetchController {

    JdbcOperation jdbc = new JdbcOperation();
    FileOperation fileOperation = new FileOperation();

    public void getCommonData() {
        String filePath = "/home/sagar/NetBeansProjects/Assignments/common.csv";
        List<ArrayList> commonData = jdbc.commonRecords();
        fileOperation.appendIntoFile(commonData, filePath);
        System.out.println(commonData);
    }

    public void getAccountOnlyData() {
        String filePath = "/home/sagar/NetBeansProjects/Assignments/accountonly.csv";
        List<ArrayList> onlyAccountData = jdbc.onlyAccountRecords();
        fileOperation.appendIntoFile(onlyAccountData, filePath);
        System.out.println(onlyAccountData);
    }

    public void getReceiptOnlyData() {
        String filePath = "/home/sagar/NetBeansProjects/Assignments/Receiptonly.csv";
        List<ArrayList> onlyReceiptData = jdbc.onlyReceiptRecords();
        fileOperation.appendIntoFile(onlyReceiptData, filePath);
        System.out.println(onlyReceiptData);
    }

}
