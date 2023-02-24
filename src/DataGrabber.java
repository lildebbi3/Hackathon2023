import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// state array position is 6, industry position is 9
public class DataGrabber {

    public static List<String[]> stateIndustryGrabber(List<String[]> rows, String state, String industry) {

        List<String[]> filteredRows = new ArrayList<>();

        for (String[] row : rows) {
            if (row[2].equals(state) && row[3].equals(industry)) {
                filteredRows.add(row);
            }
        }

        return filteredRows;
    }

    public static int[] InjuryGrabber(List<String[]> filtered){
        int[] injuries = new int[6];
        for (String[] arr : filtered) {
            injuries[0] += Integer.parseInt(arr[12]);
            injuries[1] += Integer.parseInt(arr[13]);
            injuries[2] += Integer.parseInt(arr[14]);
            injuries[3] += Integer.parseInt(arr[15]);
            injuries[4] += Integer.parseInt(arr[16]);
            injuries[5] += Integer.parseInt(arr[17]);
        }

        return  injuries;
    }

    public static Result CreateResults(String state, String industry){
        List<String[]> rows = CsvReader.readCsv();
        List<String[]> filiteredRows = stateIndustryGrabber(rows, state, industry);
        int[] injuries = InjuryGrabber(filiteredRows);
        Result output = new Result(state, industry, injuries);
        return output;
    }
}
