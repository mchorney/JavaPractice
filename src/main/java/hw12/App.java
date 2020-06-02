package hw12;

import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Map traffic = new Map(new Roads[] {Roads.ALLEY,Roads.BOULEVARD,Roads.AVENUE}, "Broadway");
        System.out.println(traffic);

        Constructions constr = new Constructions("Bulldozing",5, LandScape.LAKE);
        System.out.println(constr);
    }
}
