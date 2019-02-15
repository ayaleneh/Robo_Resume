import java.util.Scanner;

public class Delete {
    static Scanner scanner = new Scanner(System.in);
    static String choice;
    public static void delete() {
        if (Robo_Declare.name.size() <= 0) {
            System.out.println("No Resume Found");
        } else {
            System.out.println("Please enter the 'Name on the Resume'..");
            choice = scanner.nextLine();
            if (Robo_Declare.name.contains(choice)) {
                int index = Robo_Declare.name.indexOf(choice);
                for (int counter = index; counter <= index; counter++) {
                     Robo_Declare.name.remove(counter);
                    Robo_Declare.email.remove(counter);
                     Robo_Declare.phone.remove(counter);

                    for (int j = 0; j < Education.counterSaver1.get(counter)-1; j++) {
                        Education.major.remove(j);
                        Education.university.remove(j);
                        Education.year.remove(j);
                    }

                    for (int k = 0; k < Experiance.counterSaver2.get(counter)-1; k++) {
                        Experiance.title.remove(k);
                        Experiance.company.remove(k);
                        Experiance.date.remove(k);
                        Experiance.description.remove(k);
                    }

                    System.out.println("Skill:");
                    for (int l = 0; l < Skill.counterSaver3.get(counter)-1; l++) {
                        Skill.skillT.remove(l);
                        Skill.rating.remove(l);
                    }
                    System.out.println("successfully deleted..");
                }
            }
            else{
                System.out.println("No Such title found");
            }
        }
    }

}
