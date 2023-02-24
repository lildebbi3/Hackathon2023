import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String state;
        String industry;
        boolean exit = false;

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
}
