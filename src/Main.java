import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
       // readDataTest();
        List<String[]> rows = CsvReader.readCsv();
        rows = DataGrabber.StateGrabber(rows, "GA");
        rows = DataGrabber.IndustryGrabber(rows, " Electrical contractors ");

        List<String[]> filteredRows = new ArrayList<>();

        for (String[] row : rows) {
            if (row[6].equals("GA") && row[9].equals(" Electrical contractors ")) {
                filteredRows.add(row);
            }
        }

        readDataTest(filteredRows);
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
