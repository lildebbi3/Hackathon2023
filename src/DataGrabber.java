import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// state array position is 6, industry position is 9
public class DataGrabber {

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
}
