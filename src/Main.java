import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String[]> rows = CsvReader.readCsv();

        readDataTest(DataGrabber.stateIndustryGrabber(rows, "GA", " Electrical contractors "));
    }

    //Method to that tests out the CsvReader.readCsv class/method that obtains the data and prints
    //them out in the console. 1st loop goes through 20 rows,2nd loop through corresponding row's 28 columns
    public static void readDataTest(List<String[]> rows) {
        int numRows = Math.min(rows.size(), 20);
        for (int i = 0; i < numRows; i++) {
            String[] arr = rows.get(i);
            for (int e = 0; e < arr.length; e++) {
                System.out.print(arr[e] + " ");
            }
            System.out.println();
        }
    }
}
