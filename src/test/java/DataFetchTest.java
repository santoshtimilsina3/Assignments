
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
    public void onlyAccountRecords() throws FileNotFoundException, IOException {
        //get data from database
        List<ArrayList> list = jdbc.onlyAccountRecords();

        //Read file from csv file
        FileReader fr = new FileReader("/home/sagar/NetBeansProjects/Assignments/accountonly.csv");
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<ArrayList> lists = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            System.out.println(line.length());
        }
        System.out.println(lists+"lists");
        br.close();
        File file = new File("/home/sagar/NetBeansProjects/Assignments/accountonly.csv");
        Assert.assertTrue(file.exists());
    }

}
////File file=new File("Demo.txt");    //creates a new file instance  
//FileReader fr=new FileReader(file);   //reads the file  
//BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
//StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
//String line;  
//while((line=br.readLine())!=null)  
//{  
//sb.append(line);      //appends line to string buffer  
//sb.append("\n");     //line feed   
//}  
//fr.close();    //closes 

//    1. call
//            2. read file
//                    3. assert isfile created
//                            4. filr ko line 1 ko data equasto == data from list
//                                    

