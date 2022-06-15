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


public class CommonRecords extends DataFetch {

     final String filePath = "/home/sagar/NetBeansProjects/Assignments/common.csv";
    JdbcOperation jdbc = new JdbcOperation();

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public List<ArrayList> getRecords() {
        return jdbc.commonRecords();
    }

    @Override
    public FileOperation getFileOperation() {
        return new FileOperation();
    }

}
