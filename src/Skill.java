import java.util.ArrayList;
import java.util.Scanner;

public class Skill {
    static int skillCounter = 0;
    static String string_answer;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> skillT = new ArrayList<>();
    static ArrayList<String> rating = new ArrayList<>();
    static ArrayList<Integer> counterSaver3=new ArrayList<>();
    public static void generateSk() {
        skillCounter = 0;
        do {
            System.out.println("Enter a Skill: ");
            string_answer = scanner.nextLine();
            skillT.add(string_answer);
            System.out.println("Select Competency Proficiency rating: ");
            System.out.println("'1'-Fundamental");
            System.out.println("'2'-Novice");
            System.out.println("'3'-Intermediate");
            System.out.println("'4'-Advanced");
            System.out.println("'5'-Expert");
            System.out.println("'Any key'--I Want to Type");
            String levelChoice = scanner.nextLine();
            String levelType="";
            switch (levelChoice){
                case "1":
                    levelType="Fundamental";
                    break;
                case "2":
                    levelType="Novice";
                    break;
                case "3":
                    levelType="Intermediate";
                    break;
                case "4":
                    levelType="Advanced";
                    break;
                case "5":
                    levelType="Expert";
                    break;
                default:
                    levelType=scanner.nextLine();
            }
            rating.add(levelType);
            skillCounter++;
            System.out.println("Do you want to add More?...(Y|yes) Or any other key to Quit");
            String choice;
            choice=scanner.nextLine();
            if((choice.equalsIgnoreCase("y"))||(choice.equalsIgnoreCase("yes"))){
                //it continue automatically
            }
            else{
                counterSaver3.add(skillCounter);
                break;
            }
        } while (true);
    }
}
