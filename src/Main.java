import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Data grabber demonstration
        DataGrabber.createResults("GA", " Electrical contractors ").print();
        List<String[]> rows = CsvReader.readCsv();

        Scanner sc = new Scanner(System.in);
        String state;
        String industry;
        String userInput = "";

        do {
            System.out.println("\nEnter the state: ");
            state = sc.nextLine();

            System.out.println("Enter the industry: ");
            industry = sc.nextLine();

            System.out.println("\nSearching...");

            System.out.println("\n[NOT DISPLAYED TO USER]");
            readDataTest(DataGrabber.stateIndustryGrabber(rows, state, industry));

            int[] injuryArray = DataGrabber.InjuryGrabber(DataGrabber.stateIndustryGrabber(rows, state, industry));

            System.out.println("\n[THIS IS DISPLAYED TO USER]");
            System.out.println("The following cases have occurred to people working in [" + industry + "] in the state of [" + state + "]: ");
            printIntArray(injuryArray);

            System.out.println("\nWould you like to search again? (Y/N)");
            userInput = sc.nextLine().toLowerCase();
        } while (!userInput.equals("n")&&!userInput.equals("no"));
        System.out.println();

        System.out.println("[Search Ended]");
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

    public static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
