import java.util.ArrayList;

public class Robo_Declare {
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> email = new ArrayList<>();
    static ArrayList<String> phone = new ArrayList<>();
    static ArrayList<Education> educations = new ArrayList<Education>();
    static ArrayList<Experiance> experiances = new ArrayList<Experiance>();

    public static ArrayList<String> getName() {
        return name;
    }

    public static void setName(ArrayList<String> name) {
        Robo_Declare.name = name;
    }

    public static ArrayList<String> getEmail() {
        return email;
    }

    public static void setEmail(ArrayList<String> email) {
        Robo_Declare.email = email;
    }

    public static ArrayList<Education> getEducations() {
        return educations;
    }

    public static void setEducations(ArrayList<Education> educations) {
        Robo_Declare.educations = educations;
    }

    public static ArrayList<Experiance> getExperiances() {
        return experiances;
    }

    public static void setExperiances(ArrayList<Experiance> experiances) {
        Robo_Declare.experiances = experiances;
    }

}

