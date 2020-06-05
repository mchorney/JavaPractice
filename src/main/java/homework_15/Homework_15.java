package homework_15;

import homework12.Units;

//Создайте интерфейс и 2 класса которые его имплементируют
//Создайте по 2 объекта каждого класса типа Интерфейса
public class Homework_15 {
    public static void main(String[] args) {
        Units[] unit = {Units.G};
        Cake_chocolate new_chocolate_cake = new Cake_chocolate(unit, 245, 2, 200, 60, 10, 75, 60);
        new_chocolate_cake.bake();

        Units[] unit2 = {Units.ML};
        Cake_chocolate new_chocolate_cake2 = new Cake_chocolate(unit, 500, 4, 350, 100, 15, 115, 100);

        Units[] unit3 = {Units.OZ};
        Cake_banana new_banana_cake = new Cake_banana(unit2, 5, 3, 4, 4, 1, 7);
        new_banana_cake.bake();

        Units[] unit4 = {Units.G};
        Cake_banana new_banana_cake2 = new Cake_banana(unit2, 230, 2, 200, 50, 15, 450);

    }
}
