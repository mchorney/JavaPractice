package hwk16;


import hwk15.TreeFruitTypes;
import hwk15.TreeFruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*
         -----------------CREATING TreeFruits ARRAYLIST -----------------------
         */
        ArrayList<TreeFruits> fruitList = new ArrayList<>();
        TreeFruits apple = new TreeFruits(TreeFruitTypes.APPLE);
        TreeFruits pear = new TreeFruits(TreeFruitTypes.PEAR);
        TreeFruits plum = new TreeFruits(TreeFruitTypes.PLUM);
        TreeFruits fig = new TreeFruits(TreeFruitTypes.FIG);
        TreeFruits lemon = new TreeFruits(TreeFruitTypes.LEMON);
        TreeFruits orange = new TreeFruits(TreeFruitTypes.ORANGE);
        System.out.println(apple.getName());

        //adding elements to the ArrayList
        fruitList.add(apple);
        fruitList.add(pear);
        fruitList.add(orange);
        fruitList.add(lemon);
        printFruitList(fruitList);

        //Getting 4th element from the list and printing its name
        TreeFruits fruit4 = fruitList.get(3);
        System.out.print("\nItem to remove: " + fruit4.getName());

        //Removing 4th element from the arraylist and printing list contents
        fruitList.remove(3);
        printFruitList(fruitList);

        //Setting second element of the list to Plum. Pear will be replaced
        fruitList.set(1, plum);
        printFruitList(fruitList);
        //setting 3rd element of the list to Pear, as it was overridden by previous statement. As a result, items will shift to the right
        fruitList.add(2, pear);
        printFruitList(fruitList);

        //Creating two additional lists for testing: list of items that need to be added and deleted
        var listToAdd = List.of(lemon, fig);
        var listToDelete  = List.of(pear, plum, apple);
        //adding few items to the list
        fruitList.addAll(listToAdd);
        printFruitList(fruitList);
        //deleting few items from the list
        fruitList.removeAll(listToDelete);
        printFruitList(fruitList);

        /*
         -----------------CREATING String ARRAYLIST -----------------------
         */
        ArrayList <String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("brown");
        colors.add("yellow");
        System.out.println();
        System.out.println(colors);

        var favColors = List.of("blue", "green", "black", "red");
        colors.addAll(favColors);
        System.out.println(colors);
        System.out.println(colors.contains("green"));

        colors.set(1, colors.get(4));

        colors.remove(4);
        System.out.println(colors);

        colors.forEach(color -> System.out.println(color + "- ish"));

        colors.clear();
        System.out.println(colors);

        /*
         -----------------CREATING Integer ARRAYLIST -----------------------
         */

        ArrayList<Integer> daysOfWeek = new ArrayList<>();
        System.out.println(daysOfWeek.isEmpty());
        for(int i = 1; i <=7; i++) {
            daysOfWeek.add(i);
        }
        System.out.println(daysOfWeek.isEmpty());
        System.out.println(daysOfWeek.size());
        System.out.println(daysOfWeek);
        System.out.println(daysOfWeek.get(daysOfWeek.size() -2));

        daysOfWeek.add(3, 3);
        System.out.println(daysOfWeek);

        daysOfWeek.set(2, 7);
        System.out.println(daysOfWeek);

        daysOfWeek.remove(daysOfWeek.size() - 1);
        System.out.println(daysOfWeek);

        Collections.sort(daysOfWeek);
        System.out.println(daysOfWeek);

        daysOfWeek.forEach(num -> {
            switch(num) {
                case 1: System.out.println(num + " - Monday"); break;
                case 2: System.out.println(num + " - Tuesday"); break;
                case 3: System.out.println(num + " - Wednesday"); break;
                case 4: System.out.println(num + " - Thursday"); break;
                case 5: System.out.println(num + " - Friday"); break;
                case 6: System.out.println(num + " - Saturday"); break;
                case 7: System.out.println(num + " - Sunday"); break;
            }
        });



    }

        //creating static method to print TreeFruits elements names
        public static void printFruitList(ArrayList<TreeFruits> list){
            System.out.print("\nMy garden has the following trees: ");
            list.forEach(fruit -> System.out.print(fruit.getName() + " "));
        }


}

