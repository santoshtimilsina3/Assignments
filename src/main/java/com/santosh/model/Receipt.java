/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.model;

import java.util.Date;

/**
 *
 * @author santosh
 */
public class Receipt {
     private Date receiptDate;
   private Double amount;
   private String receiptDescription;

    public Receipt(Date receiptDate, Double amount, String receiptDescription) {
        this.receiptDate = receiptDate;
        this.amount = amount;
        this.receiptDescription = receiptDescription;
    }

   
    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getReceiptDescription() {
        return receiptDescription;
    }

    public void setReceiptDescription(String receiptDescription) {
        this.receiptDescription = receiptDescription;
    }
    
}
