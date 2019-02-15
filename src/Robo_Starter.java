import java.util.Scanner;

public class Robo_Starter {
    static Scanner scanner = new Scanner(System.in);
    static String string_answer;


    public static void asMain() {
        while (true) {
            String choice;
            System.out.println("|*************WELCOME************|");
            System.out.println("|******ROBO RESUME GENERATOR*****|");
            System.out.println("|*********PRESS******************|");
            System.out.println("|******'1'-Generate Resume ******|");
            System.out.println("|******'2'-Display  Resume ******|");
            System.out.println("|******'3'-Search   Resume ******|");
            System.out.println("|******'4'-Edit     Resume ******|");
            System.out.println("|******'5'-Delete   Resume ******|");
            System.out.println("|******'6'-Exit            ******|");
            System.out.println("|--------------------------------|");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    generate();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    Search.search();
                    break;
                case "4":
                    Edit.edit();
                    break;
                case "5":
                    Delete.delete();
                    break;
                case "6":
                    exit();
                    break;
            }
        }

    }

    public static void generate() {
        while (true) {
            System.out.println("Please..Enter..");
            System.out.println("Name: ");
            string_answer = scanner.nextLine();
            Robo_Declare.name.add(string_answer);
            System.out.println("Email: ");
            string_answer = scanner.nextLine();
            Robo_Declare.email.add(string_answer);
            System.out.println("Phone: ");
            string_answer = scanner.nextLine();
            Robo_Declare.phone.add(string_answer);
            Education.generateEd();

            Experiance.generateEx();

            Skill.generateSk();

            System.out.println("Sucessfully Added.");
            asMain();
        }

    }

    public static void display() {
        if (Robo_Declare.name.size() <= 0) {
            System.out.println("No Resume Found.");
        } else {

            for (int counter = 0; counter < Robo_Declare.name.size(); counter++) {
                System.out.println("===========RESUME===================");
                System.out.println("Name: " + Robo_Declare.name.get(counter));
                System.out.println("Email: " + Robo_Declare.email.get(counter));
                System.out.println("Phone: " + Robo_Declare.phone.get(counter));
                System.out.println("Education:");
                System.out.println("----------");
                for (int j = 0; j < Education.counterSaver1.get(counter); j++) {
                    System.out.println("Major In " + Education.major.get(j));
                    System.out.println("University: " + Education.university.get(j));
                    System.out.println("Graduation Year: " + Education.year.get(j));
                    System.out.println();
                }
                System.out.println();
                System.out.println("Experience:");
                System.out.println("-----------");
                for (int k = 0; k < Experiance.counterSaver2.get(counter); k++) {
                    System.out.println("Title: " + Experiance.title.get(k));
                    System.out.println("Company: " + Experiance.company.get(k));
                    System.out.println("Date: " + Experiance.date.get(k));
                    System.out.println("Description: " + Experiance.description.get(k));
                    System.out.println();
                }
                System.out.println();
                System.out.println("Skill:");
                System.out.println("------");
                for (int l = 0; l < Skill.counterSaver3.get(counter); l++) {
                    System.out.println(Skill.skillT.get(l) + "," + Skill.rating.get(l));
                    System.out.println();
                }
            }
        }
    }

    public static void exit() {
        System.exit(0);
    }

}
