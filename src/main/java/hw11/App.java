package hw11;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {


        String [] topics = {"javacore", "selenium", "api"};
        Bootcamps java = new Bootcamps ("java", "3 months", "Baurzhan",topics);
        String[] t = java.getTopics();
        for (String v:t){
            System.out.println(v);

        }


        Bootcamps javaS = new Bootcamps ("javaS", "4 months", "Azat", topics);
        System.out.println(javaS.getDuration());

        Bootcamps javaS1 = new Bootcamps("javas1", "5 months");
        javaS1.setTrainer("John");


        java.printOut();
        javaS.printOut();
        javaS1.printOut();

        String [] lastnames = {"Ivanov", "Petrov", "Sidorov"};
        Summercamps Soccer = new Summercamps ("Soccer","Outdoor", "June", lastnames);
        String[] l = Soccer.getLastnames();
        for (String v: l){
            System.out.println(v);
        }

        Summercamps Golf = new Summercamps ("Golf", "Field", "August");
        Golf.setLocation("indoor field");
        Golf.setName("Golf1");
        System.out.println(Golf.getName());


        Soccer.printOut();
        Golf.printOut();

        String[] subjects = {"math", "reading", "art", "PE"};
        Students Smith = new Students("Smith", 12, "sport", subjects);
        String[] S = Smith.getSubjects();
        for (String v : S) {
            System.out.println(v);
        }
        Smith.setHobby("music and art");
        Smith.setLastname("Smitt");
        Smith.setAge(13);

        Smith.printOut();

        String[] subjects1 = {"music", "science", "coding", "art"};
        Students Lowes = new Students("Lowes", 11, "robotics", subjects1);
        String[] L = Lowes.getSubjects();
        for (String v : L) {
            System.out.println(v);

        }

        Lowes.printOut();
    }}
