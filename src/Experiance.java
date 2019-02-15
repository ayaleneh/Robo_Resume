import java.util.ArrayList;
import java.util.Scanner;

public class Experiance {
    static ArrayList<String> title = new ArrayList<>();
    static ArrayList<String> company = new ArrayList<>();
    static ArrayList<String> date = new ArrayList<>();
    static ArrayList<String> description = new ArrayList<>();
    static ArrayList<Integer> counterSaver2 = new ArrayList<>();
    static String string_answer;
    static Scanner scanner = new Scanner(System.in);
    static int experianceCounter = 0;

    public static ArrayList<String> getTitle() {
        return title;
    }

    public static void setTitle(ArrayList<String> title) {
        Experiance.title = title;
    }

    public static ArrayList<String> getCompany() {
        return company;
    }

    public static void setCompany(ArrayList<String> company) {
        Experiance.company = company;
    }

    public static ArrayList<String> getDate() {
        return date;
    }

    public static void setDate(ArrayList<String> date) {
        Experiance.date = date;
    }

    public static ArrayList<String> getDescription() {
        return description;
    }

    public static void setDescription(ArrayList<String> description) {
        Experiance.description = description;
    }

    public static void generateEx() {
        experianceCounter = 0;
        do {
            System.out.println("Experience");
            System.out.println("Title:");
            string_answer = scanner.nextLine();
            title.add(string_answer);
            System.out.println("Company:");
            string_answer = scanner.nextLine();
            company.add(string_answer);
            System.out.println("Date:");
            string_answer = scanner.nextLine();
            date.add(string_answer);
            System.out.println("Description:");
            string_answer = scanner.nextLine();
            description.add(string_answer);
            experianceCounter++;

            System.out.println("Do you want to add More?...(Y|yes) Or any other key to Quit");
            String choice;
            choice = scanner.nextLine();
            if ((choice.equalsIgnoreCase("y")) || (choice.equalsIgnoreCase("yes"))) {
                //it continue automatically
            } else {
                counterSaver2.add(experianceCounter);
                break;
            }
        } while (true);
    }
}


