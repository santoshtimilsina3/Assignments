/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.repository;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOperation {

    public void appendIntoFile(ArrayList<ArrayList> list) {
        String filePath = "/home/sagar/NetBeansProjects/mavenproject1/Assignments/output.csv";
        try {
            File file = new File(filePath);
            if (!file.exists()) {
             file=  createNewFile(filePath);
            }
            PrintWriter pw = new PrintWriter(file);
            for (ArrayList data : list) {
                data.forEach((individualData) -> {
                    if (individualData != null) {
                        pw.append(individualData.toString());
                        pw.print(",");
                    } else {
                        pw.print(",");
                    }
                });
                pw.println();
            }
            pw.close();

        } catch (IOException e) {
            System.out.println("file error " + e);
        }
    }

    private File createNewFile(String filePath) throws IOException {
        CSVWriter csvFile = new CSVWriter(new FileWriter(filePath));
        return new File(filePath);
    }

}
