/*A phone directory holds a list of names with a phone number for each name. It is possible to find the number associated with a given name, and to specify the phone number for a given name. 

 [Hint:use a HashMap to store names as keys and phone numbers as values. The user can choose to find a number by providing a name or add a new name with a phone number. The program runs in a loop until the user chooses to exit.]*/

package Demo;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        // Create a HashMap to store names as keys and phone numbers as values
        HashMap<String, String> directory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu options
            System.out.println("\nPhone Directory Menu:");
            System.out.println("1. Find phone number by name");
            System.out.println("2. Add new contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Find phone number by name
                    System.out.print("Enter name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (directory.containsKey(nameToSearch)) {
                        System.out.println("Phone number of " + nameToSearch + " is: " + directory.get(nameToSearch));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 2:
                    // Add new contact
                    System.out.print("Enter name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String newNumber = scanner.nextLine();
                    directory.put(newName, newNumber);
                    System.out.println("Contact added successfully!");
                    break;

                case 3:
                    // Exit program
                    exit = true;
                    System.out.println("Exiting phone directory. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}

/*
Phone Directory Menu:
1. Find phone number by name
2. Add new contact
3. Exit
Enter your choice (1-3): 1
Enter name to search: Amaan
Contact not found.

Phone Directory Menu:
1. Find phone number by name
2. Add new contact
3. Exit
Enter your choice (1-3): 2
Enter name: Amaan
Enter phone number: 9167710753
Contact added successfully!

Phone Directory Menu:
1. Find phone number by name
2. Add new contact
3. Exit
Enter your choice (1-3): 1
Enter name to search: Amaan
Phone number of Amaan is: 9167710753

Phone Directory Menu:
1. Find phone number by name
2. Add new contact
3. Exit
Enter your choice (1-3): 3
Exiting phone directory. Goodbye!
*/

