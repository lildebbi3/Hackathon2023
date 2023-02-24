import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// state array position is 6, industry position is 9
public class DataGrabber {
    //limits down the search with the requested State
    public static List<String[]> StateGrabber(List<String[]> rows, String state){
        List<String[]> stateData = new ArrayList<>();
        int rowsSize = rows.size();
        for(int i=0;i<rowsSize;i++){
            String[] arr = rows.get(i);
            //System.out.println(arr[7]);
            //compares if row is the users requested state, if true adds it to stateData,
            if(Objects.equals(arr[6], state)){
                stateData.add(arr);
            }
        }
        return stateData;
    }
    //limts down the search with the requested Industry
    public static List<String[]> IndustryGrabber(List<String[]> rows, String industry){
        List<String[]> industryData = new ArrayList<>();
        int rowsSize = rows.size();
        for(int i=0;i<rowsSize;i++){
            String[] arr = rows.get(i);
            //compares if row is the users requested industry, if true adds it to industryData,
            if(Objects.equals(arr[9], industry)){
                industryData.add(rows.get(i));
            }
        }
        return industryData;
    }
}
