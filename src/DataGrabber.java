import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// state array position is 6, industry position is 9
public class DataGrabber {

    //filiters the dataset for the user requestedd state and industry
    public static List<String[]> stateIndustryGrabber(List<String[]> rows, String state, String industry) throws IllegalArgumentException {
        List<String[]> filteredRows = new ArrayList<>();
        try {
            //goes through and rows containing user inputted state and industry
            for (String[] row : rows) {
                if (row[2].equals(state) && row[3].equals(industry)) {
                    filteredRows.add(row);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Handle the exception here, e.g. by logging an error message or re-throwing the exception
            throw new IllegalArgumentException("Error occurred while filtering rows: " + ex.getMessage());
        }
        //spits out the filtered rows.
        return filteredRows;
    }


    //counts the injuries obtained in specified state and industry
    public static int[] InjuryGrabber(List<String[]> filtered) throws NumberFormatException {
        int[] injuries = new int[6];
        for (String[] arr : filtered) {
            try {
                injuries[0] += Integer.parseInt(arr[12]);
                injuries[1] += Integer.parseInt(arr[13]);
                injuries[2] += Integer.parseInt(arr[14]);
                injuries[3] += Integer.parseInt(arr[15]);
                injuries[4] += Integer.parseInt(arr[16]);
                injuries[5] += Integer.parseInt(arr[17]);
            } catch (NumberFormatException ex) {
                // Handle the exception here, e.g. by logging an error message or re-throwing the exception
                throw new NumberFormatException("Error occurred while parsing integer: " + ex.getMessage());
            }
        }
        return injuries;
    }


    //sets up a Result object
    public static Result createResults(String state, String industry) throws Exception {
        try {
            List<String[]> rows = CsvReader.readCsv();
            List<String[]> filteredRows = stateIndustryGrabber(rows, state, industry);
            int[] injuries = InjuryGrabber(filteredRows);
            Result output = new Result(state, industry, injuries);
            return output;
        } catch (Exception ex) {
            // Handle the exception here, e.g. by logging an error message or re-throwing the exception
            throw new Exception("Error occurred while creating results: " + ex.getMessage(), ex);
        }
    }

}
