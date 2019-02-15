import java.util.ArrayList;
import java.util.Scanner;

public class Education {
     static ArrayList<String>major=new ArrayList<>();
     static ArrayList<String>university=new ArrayList<>();
     static ArrayList<String>year=new ArrayList<>();
     static ArrayList<Integer>counterSaver1=new ArrayList<>();
    static String string_answer;
    static Scanner scanner = new Scanner(System.in);
    static int educationCounter = 0;
    public static ArrayList<String> getDescription() {
        return description;
    }

    public static void setDescription(ArrayList<String> description) {
        Education.description = description;
    }

    private static ArrayList<String>description=new ArrayList<>();

    public static ArrayList<String> getMajor() {
        return major;
    }

    public static void setMajor(ArrayList<String> major) {
        Education.major = major;
    }

    public static ArrayList<String> getUniversity() {
        return university;
    }

    public static void setUniversity(ArrayList<String> university) {
        Education.university = university;
    }

    public static ArrayList<String> getYear() {
        return year;
    }

    public static void setYear(ArrayList<String> year) {
        Education.year = year;
    }
    public static void generateEd(){
        educationCounter=0;
        do{
            System.out.println("Education");
            System.out.println("Major:");
            string_answer = scanner.nextLine();
            major.add(string_answer);
            System.out.println("University:");
            string_answer = scanner.nextLine();
            university.add(string_answer);
            System.out.println("Year:");
            string_answer = scanner.nextLine();
            year.add(string_answer);
            educationCounter++;
            System.out.println("Do you want to add More?...(Y|yes) Or any other key to Quit");
            String choice;
            choice=scanner.nextLine();
            if((choice.equalsIgnoreCase("y"))||(choice.equalsIgnoreCase("yes"))){
              //it continue automatically
            }
            else{
                counterSaver1.add(educationCounter);
                break;
            }
        }while (true);
    }

}
