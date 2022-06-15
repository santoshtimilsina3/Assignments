/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
