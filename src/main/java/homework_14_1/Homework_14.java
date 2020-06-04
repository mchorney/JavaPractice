package homework_14_1;
//1. Создать один супер и 2 или 3 детских создать объекты
//2. Попробуйте создать функцию в супер классе и в произвлдном классе с одинаковым именем и разным функционалом

import homework12.Units;

public class Homework_14 {
    public static void main(String[] args) {
        Units[] unit = {Units.G};
        Cake_recipe_chocolate new_chocolate_cake = new Cake_recipe_chocolate(unit, 245, 2, 200, 60, 10, 75, 60);
        new_chocolate_cake.printInfo();

        Units[] unit2 = {Units.OZ};
        Cake_recipe_banana new_banana_cake = new Cake_recipe_banana(unit2, 5, 3, 4, 4, 1, 7);
        new_banana_cake.printInfo();
    }
}
