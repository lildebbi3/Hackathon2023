import java.util.List;

public class Main {
    public static void main(String[] args){
        readDataTest();
    }

    //Method to that tests out the CsvReader.readCsv class/method that obtains the data and prints
    //them out in the console. 1st loop goes through 20 rows,2nd loop through corresponding row's 28 columns
    public static void readDataTest(){
        List<String[]> rows = CsvReader.readCsv();
        for(int i=0;i<20;i++){
            String[] arr = rows.get(i);
            for(int e=0;e<28;e++){
                System.out.print(arr[e]+" ");
            }
            System.out.println();
        }
    }

}
