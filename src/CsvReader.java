import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public static List<String[]> readCsv() {
        String fileName = "Data/Data.csv";
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                rows.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
