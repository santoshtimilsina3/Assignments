
package com.santosh.controller;

import com.santosh.repository.FileOperation;
import java.util.ArrayList;
import java.util.List;


public abstract class DataFetch {

    public abstract String getFilePath();

    public abstract List<ArrayList> getRecords();

    public abstract FileOperation getFileOperation();

    public void appendAndPrint() {
        getFileOperation().WriteIntoFile(getRecords(), getFilePath());
        System.out.println(getRecords());
    }

}
