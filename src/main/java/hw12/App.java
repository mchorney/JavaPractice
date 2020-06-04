package hw12;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Client Nick = new Client("Nick", 2,Gyms.LAFITNESS);

        Nick.printOut();

        Trainer Vlad = new Trainer("Vlad",50,4.9,new WorkoutType[]{WorkoutType.CARDIO});

        Vlad.printOut();


    }
}