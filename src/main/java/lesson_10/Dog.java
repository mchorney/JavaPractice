package lesson_10;

public class Dog {

    public String name;
    public String breed;
    public int weight;

    public void bark(){
        System.out.println(name+ ": Wof-wof");
    }

    public void beg_for_food(){
        System.out.println(name+ ": Please give me that yummy thing you eat");
    }

    public int food_calculator(int weight){
        if (weight<=25){
            return 1;
        }
        else if (weight <= 35){
            return 2;
        }
        else if (weight <= 45){
            return 3;
        }
        else return 4;
    }
}
