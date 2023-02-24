import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
Reads out the Data.csv file and stores them in a List<String[]>. List elements are the rows that are
String elements that store the column values.
 */
public class CsvReader {
    public static List<String[]> readCsv() {
        //folder/file.file type
        String fileName = "Data/Data.csv";
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            //splits the line based off of the ',' and stores it in the String[]
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                rows.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
