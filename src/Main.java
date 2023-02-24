import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        DataGrabber.createResults("GA", " Electrical contractors ").print();

        Scanner scanner = new Scanner(System.in);
        String state;
        String industry;
        //exit will be true until computation/searching functions are completed
        boolean exit = true;

        while (!exit) {
            System.out.println("Please choose an option:");
            System.out.println("1. Enter state");
            System.out.println("2. Enter industry");
            System.out.println("3. Search");
            System.out.println("4. Exit program");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter state (Ex: GA, NC): ");
                    state = scanner.nextLine();
                    System.out.println("You entered: " + state);
                }
                case 2 -> {
                    System.out.print("Enter industry (Ex: Construction, healthcare): ");
                    industry = scanner.nextLine();
                    System.out.println("You entered: " + industry);
                }
                case 3 -> System.out.println("Executing search...");

                // execute the search based on the user's state and industry inputs
                // TODO: implement search logic here
                case 4 -> {
                    System.out.println("Exiting program...");
                    exit = true;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
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
