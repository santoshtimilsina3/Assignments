
import com.santosh.repository.JdbcOperation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

public class DataFetchTest {

    @InjectMocks
    JdbcOperation jdbc = new JdbcOperation();

    @Test
    public void receiptOnlyRecords() throws FileNotFoundException, IOException {

        //get data from database
        List<ArrayList> list = jdbc.onlyReceiptRecords();
        Object databaseData[][] = new Object[3][4];
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Object> eachList = list.get(i);
            for (int j = 0; j < eachList.size(); j++) {
                databaseData[i][j] = eachList.get(j);
            }
        }

        String line = "";
        String splitBy = ",";

        //parsing a CSV file into BufferedReader class constructor  
        String[][] fileData = new String[3][4];
        BufferedReader br = new BufferedReader(new FileReader("/home/sagar/NetBeansProjects/Assignments/receiptonly.csv"));
        int i = 0;
        while ((line = br.readLine()) != null) {
            String[] employee = line.split(splitBy);
            for (int j = 0; j < employee.length; j++) {
                fileData[i][j] = employee[j];
            }
            i++;
        }

        //Test if the file exits
        File file = new File("/home/sagar/NetBeansProjects/Assignments/receiptonly.csv");
        Assert.assertTrue(file.exists());
       //test if the data of database and file is same
        for (int a = 0; a < 3; i++) {
            for (int b = 0; b < 4; b++) {
                Assert.assertEquals(databaseData[a][b].toString(), fileData[a][b]);
            }
        }
    }
}

//Read file from csv file
//        FileReader fr = new FileReader("/home/sagar/NetBeansProjects/Assignments/receiptonly.csv");
//        BufferedReader br = new BufferedReader(fr);
//        String fileData[][] = new String[3][4];
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line + "before split array");
//            // line = line.substring(0, line.length() - 1);
//            System.out.println(line + "char array");
//            //    lists.add(line);
//        }
//
//        }
//       for (int i = 0; i < lists.size(); i++) {
//
//    1. call
//            2. read file
//                    3. assert isfile created
//                            4. filr ko line 1 ko data equasto == data from list
//                                    

