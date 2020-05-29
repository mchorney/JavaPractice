package hw11;

/*
Сделать 3 класса - в каждом классе по краней мере 3 fields
Каждый аттрибут имеет setter и getter
Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
создайте в каждом классе метод printClass() - для вывода всех полей на экран
По крайней мере один атрибут в одном классе должен быть array
Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым.
Объект созданный дефолтовым конструктором заполните при помощи сеттеров
Выведите на экран эти объекты функцией printClass()
 */

public class App {
    public static void main(String[] args) {

        // Cats
        Cat vaska = new Cat();
        vaska.setName("Vaska");
        vaska.setAge(2);
        vaska.setColor("Grey");
        vaska.printClass();
        String[] colors = {"White", "Red", "Black", "Grey", "Brown", "Mix"};
        Cat murka = new Cat("Murka", 3, colors[0]);
        murka.printClass();

        // Dogs
        Dog robert = new Dog();
        robert.setName("Robert");
        robert.setAge(4);
        robert.setWeight(10);
        robert.setColor("Black");
        robert.printClass();
        Dog martha = new Dog("Martha", 5, 6, "Brown");
        martha.printClass();

        // Persons
        Person carl = new Person();
        carl.setFirstName("Carl");
        carl.setLastName("Smith");
        carl.setAge(28);
        carl.setHeight(185);
        carl.printClass();
        Person samantha = new Person("Samantha", "Peterson", 25, 175);
        samantha.printClass();

    }
}
