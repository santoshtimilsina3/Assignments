
package com.santosh.repository;

import com.santosh.util.JdbcConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcOperation {

    JdbcConnection connection = new JdbcConnection();
    FileOperation fileOperation = new FileOperation();

    public List<ArrayList> commonRecords() {
        List<ArrayList> list = null;
        try {
            Connection con = connection.getConnection();
            String query = "select * from assignment.account a join assignment.receipt r on a.amount=r.amount WHERE a.account_description rlike  r.receipt_description";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            list = getResultSet(result);

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.closeConnection();
        }
        return list;
    }

    private List<ArrayList> getResultSet(ResultSet result) throws SQLException {
        ResultSetMetaData metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();
        List<ArrayList> list = new ArrayList<>();
        while (result.next()) {
            ArrayList<Object> resultList = new ArrayList();
            for (int startIndex = 1; startIndex <= columnCount; startIndex++) {
                resultList.add(result.getObject(startIndex));
            }
            list.add(resultList);
        }
        return list;
    }

    public List<ArrayList> onlyAccountRecords() {
        List<ArrayList> list = null;
        try {
            Connection con = connection.getConnection();
            String query = "select a.id,transaction_date, a.amount, account_description from assignment.account a left join assignment.receipt r on a.amount=r.amount where r.id is null";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            list = getResultSet(result);
            return list;
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.closeConnection();
        }
        return list;
    }

    public List<ArrayList> onlyReceiptRecords() {
        List<ArrayList> list = null;
        try {
            Connection con = connection.getConnection();
            String query = "select r.id,receipt_date,r.amount,receipt_description from assignment.receipt r left join assignment.account a on a.amount=r.amount where a.id is null";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            list = getResultSet(result);
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.closeConnection();
        }
        return list;
    }

    public List<ArrayList> allTableData() {
        List<ArrayList> list = null;
        try {
            Connection con = connection.getConnection();
            String query = "SELECT * FROM account LEFT JOIN receipt  ON account.amount = receipt.amount UNION SELECT * FROM account RIGHT JOIN receipt ON account.amount = receipt.amount;";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            list = getResultSet(result);
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection.closeConnection();
        }
        return list;
    }

}
