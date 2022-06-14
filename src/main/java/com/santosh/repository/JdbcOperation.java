/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.repository;

import com.santosh.util.JdbcConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcOperation {

    JdbcConnection connection = new JdbcConnection();
    FileOperation fileOperation = new FileOperation();

    public void commonRecords() {
        try {
            Connection con = connection.getConnection();
            String query = "select * from assignment.account a join assignment.receipt r on a.amount=r.amount WHERE a.account_description rlike  r.receipt_description";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            getResultSet(result);
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.closeConnection();
        }
    }

    private void getResultSet(ResultSet result) throws SQLException {
        ResultSetMetaData metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();
        ArrayList<ArrayList> list = new ArrayList<>();
        while (result.next()) {
            ArrayList<Object> resultList = new ArrayList();
            for (int startIndex = 1; startIndex <= columnCount; startIndex++) {
                resultList.add(result.getObject(startIndex));
            }
            list.add(resultList);
        }
        System.out.println(list);
        fileOperation.appendIntoFile(list);
    }

    public void onlyAccountRecords() {
        try {
            Connection con = connection.getConnection();
            String query = "select * from assignment.account a left join assignment.receipt r on a.amount=r.amount where r.id is null";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            getResultSet(result);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.closeConnection();
        }
    }

    public void onlyReceiptRecords() {
        try {
            Connection con = connection.getConnection();
            String query = "select * from assignment.receipt r left join assignment.account a on a.amount=r.amount where a.id is null";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            getResultSet(result);
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.closeConnection();
        }
    }

}
