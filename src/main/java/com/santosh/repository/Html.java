/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.repository;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author sagar
 */
public class Html {
    public void htmlFile() {
        try{
        File f = new File("//home/sagar/NetBeansProjects/mavenproject1/source.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html><body><h1>Blah, Blah!</h1>");
        bw.write("<textarea cols=75 rows=10>");
        for (int i=0; i<20; i++) {
            bw.write("Blah blah..");
        }
         bw.write("</textarea>");
        bw.write("</body></html>");
        Desktop.getDesktop().browse(f.toURI());
         bw.close();
        }catch(Exception e){
            
        }finally{
       
       
}
        
    }
}
    

