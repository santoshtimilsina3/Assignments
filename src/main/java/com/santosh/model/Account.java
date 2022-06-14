/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author santosh
 */
public class Account {
    private Date transactionDate;
    private Double amount;
    private String accountDescription;

    public Account(Date transactionDate, Double amount, String accountDescription) {
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.accountDescription = accountDescription;
    }

    
    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAccountDescription() {
        return accountDescription;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.transactionDate);
        hash = 83 * hash + Objects.hashCode(this.amount);
        hash = 83 * hash + Objects.hashCode(this.accountDescription);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.accountDescription, other.accountDescription)) {
            return false;
        }
        if (!Objects.equals(this.transactionDate, other.transactionDate)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Account{" + "transactionDate=" + transactionDate + ", amount=" + amount + ", accountDescription=" + accountDescription + '}';
    }
    
    
}

