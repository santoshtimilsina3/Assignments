/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.model;

import java.util.Date;
import java.util.Objects;

public class Account {
    private int id;
    private Date transactionDate;
    private Double amount;
    private String accountDescription;

  

  

    public Account setId(int id) {
        this.id = id;
        return this;
    }

   
    public Account setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }


    public Account setAmount(Double amount) {
        this.amount = amount;
        return this;
    }


    public Account setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.transactionDate);
        hash = 29 * hash + Objects.hashCode(this.amount);
        hash = 29 * hash + Objects.hashCode(this.accountDescription);
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
        if (this.id != other.id) {
            return false;
        }
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
        return "Account{" + "id=" + id + ", transactionDate=" + transactionDate + ", amount=" + amount + ", accountDescription=" + accountDescription + '}';
    }

    

    
    
}

