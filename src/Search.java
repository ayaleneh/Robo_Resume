import java.util.Collections;
import java.util.Scanner;

public class Search {
    static Scanner scanner=new Scanner(System.in);
    static String choice;
    public static void search() {
        System.out.println("Search By");
        System.out.println("'1'-Skill");
        System.out.println("'2'-Name");
        System.out.println("'3'-Email");
        System.out.println("'4'-Phone");
        System.out.println("'Any key'-Stop Searching");
        choice=scanner.nextLine();
        switch (choice){
            case "1":
                System.out.println("Please type Skill:");
                choice = scanner.nextLine();
                int index = Collections.binarySearch(Skill.skillT, choice);
                if(index>=0) {
                    System.out.println("Match Resume");

                    for (int counter = index; counter <= index; counter++) {
                        System.out.println("Name: " + Robo_Declare.name.get(counter));
                        System.out.println("Email: " + Robo_Declare.email.get(counter));
                        System.out.println("Phone: " + Robo_Declare.phone.get(counter));
                        System.out.println("Education:");
                        for (int j = 0; j < Education.counterSaver1.get(counter); j++) {
                            System.out.println("Major In " + Education.major.get(j));
                            System.out.println("University: " + Education.university.get(j));
                            System.out.println("Graduation Year: " + Education.year.get(j));
                        }

                        System.out.println("Experience:");
                        for (int k = 0; k < Experiance.counterSaver2.get(counter); k++) {
                            System.out.println("Title: " + Experiance.title.get(k));
                            System.out.println("Company: " + Experiance.company.get(k));
                            System.out.println("Date: " + Experiance.date.get(k));
                            System.out.println("Description: " + Experiance.description.get(k));
                        }

                        System.out.println("Skill:");
                        for (int l = 0; l < Skill.counterSaver3.get(counter); l++) {
                            System.out.println(Skill.skillT.get(l) + "," + Skill.rating.get(l));
                        }
                    }
                }else {
                    System.out.println("No such Resume Found");
                }
                break;
            case "2":
                System.out.println("Please type Name:");
                choice = scanner.nextLine();
                int index2 = Collections.binarySearch(Robo_Declare.name, choice);
                if(index2>=0){
                    System.out.println("Match Resume");

                    for (int counter = index2; counter <=index2; counter++) {
                        System.out.println("Name: " + Robo_Declare.name.get(counter));
                        System.out.println("Email: " + Robo_Declare.email.get(counter));
                        System.out.println("Phone: " + Robo_Declare.phone.get(counter));
                        System.out.println("Education:");
                        for (int j = 0; j < Education.counterSaver1.get(counter); j++) {
                            System.out.println("Major In " + Education.major.get(j));
                            System.out.println("University: " + Education.university.get(j));
                            System.out.println("Graduation Year: " + Education.year.get(j));
                        }

                        System.out.println("Experience:");
                        for (int k = 0; k < Experiance.counterSaver2.get(counter); k++) {
                            System.out.println("Title: " + Experiance.title.get(k));
                            System.out.println("Company: " + Experiance.company.get(k));
                            System.out.println("Date: " + Experiance.date.get(k));
                            System.out.println("Description: " + Experiance.description.get(k));
                        }

                        System.out.println("Skill:");
                        for (int l = 0; l < Skill.counterSaver3.get(counter); l++) {
                            System.out.println(Skill.skillT.get(l) + "," + Skill.rating.get(l));
                        }
                    }
                }
                else {
                    System.out.println("No such Resume Found");
                }

                break;
            case "3":
                System.out.println("Please type Email:");
                choice = scanner.nextLine();
                int index3 = Collections.binarySearch(Robo_Declare.email, choice);
                if(index3>=0) {

                    System.out.println("Match Resume");

                    for (int counter = index3; counter <= index3; counter++) {
                        System.out.println("Name: " + Robo_Declare.name.get(counter));
                        System.out.println("Email: " + Robo_Declare.email.get(counter));
                        System.out.println("Phone: " + Robo_Declare.phone.get(counter));
                        System.out.println("Education:");
                        for (int j = 0; j < Education.counterSaver1.get(counter); j++) {
                            System.out.println("Major In " + Education.major.get(j));
                            System.out.println("University: " + Education.university.get(j));
                            System.out.println("Graduation Year: " + Education.year.get(j));
                        }

                        System.out.println("Experience:");
                        for (int k = 0; k < Experiance.counterSaver2.get(counter); k++) {
                            System.out.println("Title: " + Experiance.title.get(k));
                            System.out.println("Company: " + Experiance.company.get(k));
                            System.out.println("Date: " + Experiance.date.get(k));
                            System.out.println("Description: " + Experiance.description.get(k));
                        }

                        System.out.println("Skill:");
                        for (int l = 0; l < Skill.counterSaver3.get(counter); l++) {
                            System.out.println(Skill.skillT.get(l) + "," + Skill.rating.get(l));
                        }
                    }
                }
                else {
                    System.out.println("No such Resume Found");
                }
                break;
            case "4":
                System.out.println("Please type Phone:");
                choice = scanner.nextLine();
                int index4 = Collections.binarySearch(Robo_Declare.phone, choice);
                System.out.println("Match Resume");
             if(index4>=0) {
                 for (int counter = index4; counter <= index4; counter++) {
                     System.out.println("Name: " + Robo_Declare.name.get(counter));
                     System.out.println("Email: " + Robo_Declare.email.get(counter));
                     System.out.println("Phone: " + Robo_Declare.phone.get(counter));
                     System.out.println("Education:");
                     for (int j = 0; j < Education.counterSaver1.get(counter); j++) {
                         System.out.println("Major In " + Education.major.get(j));
                         System.out.println("University: " + Education.university.get(j));
                         System.out.println("Graduation Year: " + Education.year.get(j));
                     }

                     System.out.println("Experience:");
                     for (int k = 0; k < Experiance.counterSaver2.get(counter); k++) {
                         System.out.println("Title: " + Experiance.title.get(k));
                         System.out.println("Company: " + Experiance.company.get(k));
                         System.out.println("Date: " + Experiance.date.get(k));
                         System.out.println("Description: " + Experiance.description.get(k));
                     }

                     System.out.println("Skill:");
                     for (int l = 0; l < Skill.counterSaver3.get(counter); l++) {
                         System.out.println(Skill.skillT.get(l) + "," + Skill.rating.get(l));
                     }
                 }
             }else {
                 System.out.println("No such Resume Found");
             }
                break;
                default:
                    Robo_Starter.asMain();
        }
    }

}
