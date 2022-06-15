
package com.santosh.repository;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {

    public void WriteIntoFile(List<ArrayList> list, String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(filePath);
            for (ArrayList data : list) {
                data.forEach((individualData) -> {
                    if (individualData != null) {
                        pw.write(individualData.toString());
                        pw.write(",");
                    } else {
                        pw.print(",");
                    }
                });
                pw.println();
            }
            pw.flush();
            pw.close();

        } catch (IOException e) {
            System.out.println("file error " + e);
        }
    }

}
