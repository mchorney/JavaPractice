package hw17;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String,String> variables = new HashMap<String,String>();
        HashMap<Integer,String> lessons = new HashMap<Integer, String>();
        HashMap<DoctorWho,Companion> dw = new HashMap<DoctorWho,Companion>();

        DoctorWho tenth = new DoctorWho(10);
        Companion donna = new Companion("Donna Noble");
        DoctorWho ninth = new DoctorWho(9);
        Companion rosa = new Companion("Rose Tyler");
        DoctorWho eleventh = new DoctorWho(11);
        Companion ponds = new Companion("Rory and Amelia Pond");
        DoctorWho twelfth = new DoctorWho(12);
        Companion clara = new Companion("Clara Oswald");

        variables.put("Integer "," Whole numbers");
        variables.put("String ", " What is it?");
        variables.put("Boolean ", " True or false statement");
        variables.put("Char ", " Single characters");

        variables.replace("String "," Text");
        System.out.println(variables);

        lessons.put(12,"Enums, Further classes; ");
        lessons.put(14, "Inheritance, Protected; ");
        lessons.put(15, "Interface, Abstract class; ");
        lessons.put(21, "French, useful words; ");

        System.out.println("Need to remove lesson - " + lessons.get(21));
        lessons.remove(21);
        System.out.println("Lessons = " + lessons);

        dw.put(ninth,rosa);
        dw.put(tenth,donna);
        dw.put(eleventh,ponds);
        dw.put(twelfth,clara);

        for(Map.Entry<DoctorWho,Companion> entry : dw.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
