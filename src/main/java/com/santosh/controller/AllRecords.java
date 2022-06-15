
package com.santosh.controller;

import com.santosh.repository.FileOperation;
import com.santosh.repository.JdbcOperation;
import java.util.ArrayList;
import java.util.List;


public class AllRecords extends DataFetch {

    private final String filePath = "/home/sagar/NetBeansProjects/Assignments/alltabledata.csv";
    JdbcOperation jdbc = new JdbcOperation();

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public List<ArrayList> getRecords() {
        return jdbc.allTableData();
    }

    @Override
    public FileOperation getFileOperation() {
        return new FileOperation();
    }

}
