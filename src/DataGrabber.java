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


}
