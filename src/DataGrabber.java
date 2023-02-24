import java.util.List;
// state array position is 6, industry position is 9
public class DataGrabber {
    List<String[]> rows = CsvReader.readCsv();
    //limits down the search with the requested State
    public static List<String[]> StateGrabber(List<String[]> rows, String state, String industry){
       // List<String[]>
        int rowsSize = rows.size();
        for(int i=0;i<rowsSize;i++){
            String[] arr = rows.get(i);
            for(int e=0;e<28;e++){
                System.out.print(arr[e]);
            }
            System.out.println();
        }
        return null;
    }
}
