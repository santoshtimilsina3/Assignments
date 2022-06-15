
package com.santosh.controller;

import com.santosh.repository.FileOperation;
import com.santosh.repository.JdbcOperation;
import java.util.ArrayList;
import java.util.List;


public class AccountOnly extends DataFetch{

   private final String filePath = "/home/sagar/NetBeansProjects/Assignments/accountonly.csv";
    JdbcOperation jdbc = new JdbcOperation();

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public List<ArrayList> getRecords() {
       return jdbc.onlyAccountRecords();
    }

    @Override
    public FileOperation getFileOperation() {
        return new FileOperation();
    }

}
