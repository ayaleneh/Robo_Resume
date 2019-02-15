import java.util.Collections;
import java.util.Scanner;

public class Edit {
    static Scanner scanner = new Scanner(System.in);
    static String choice;

    public static void edit() {
        System.out.println("Which thing you want to Edit");
        System.out.println("'1'-Name");
        System.out.println("'2'-Email");
        System.out.println("'3'-Phone");
        System.out.println("'Any key'-Stop Editing");
        choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("please enter the existing Name");
                choice = scanner.nextLine();
                int index = Collections.binarySearch(Robo_Declare.name, choice);
                if (index >= 0) {
                    System.out.println("Please enter the new Name:");
                    choice = scanner.nextLine();
                    Robo_Declare.name.set(index, choice);
                    System.out.println("successfully edited");
                    Robo_Starter.asMain();
                } else {
                    System.out.println("No Such Name Exist");
                    Robo_Starter.asMain();
                }
                break;
            case "2":
                System.out.println("please enter the existing Email");
                choice = scanner.nextLine();
                int index2 = Collections.binarySearch(Robo_Declare.email, choice);
                if (index2 >= 0) {
                    System.out.println("Please enter the new Email:");
                    choice = scanner.nextLine();
                    Robo_Declare.email.set(index2, choice);
                    System.out.println("successfully edited");
                    Robo_Starter.asMain();
                } else {
                    System.out.println("No Such Email Exist");
                    Robo_Starter.asMain();
                }
                break;
            case "3":
                System.out.println("please enter the existing Phone");
                choice = scanner.nextLine();
                int index3 = Collections.binarySearch(Robo_Declare.phone, choice);
                if (index3 >= 0) {
                    System.out.println("Please enter the new Phone:");
                    choice = scanner.nextLine();
                    Robo_Declare.phone.set(index3, choice);
                    System.out.println("successfully edited");
                    Robo_Starter.asMain();
                } else {
                    System.out.println("No Such Name Exist");
                }
                break;
            default:
                Robo_Starter.asMain();
        }
    }
}
