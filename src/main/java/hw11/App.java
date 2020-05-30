package hw11;

import l11.*;

public class App {

    public static <Char> void main(String[] args) {

        Customer vlad = new Customer("Vlad", "Ivanov", 41, 'M');
        vlad.printOut();

        Customer andrey = new Customer();
        andrey.setName("Andrey");
        andrey.setLastName("Andreev");
        andrey.setAge(32);
        andrey.setGender('M');
        andrey.printOut();



        TV samsung = new TV();
        samsung.setBrand("Samsung");
        samsung.setModel("SmartTv");
        samsung.setSize(40);
        samsung.printOut();

        TV toshiba = new TV("Toshiba", "Idial", 75);
        toshiba.printOut();



        String[] color = {"White", "Red", "Blue"};
        char[] size = {'S', 'M', 'L'};
        T_shirt withSleeves = new T_shirt(color, "Sleeves", size);

        String[] colors = {"White", "Red", "Blue"};
        char[] sizes = {'S', 'M', 'L'};
        T_shirt sleeveless = new T_shirt(colors, "Sleeveless", sizes);

        sleeveless.printOut();

        String[] c = sleeveless.getColor();
        for (String v : c) {
            System.out.println(v);
        }

        char[] s = sleeveless.getSize();
        for (char v : s){
            System.out.println(s);
        }



    }
}



/*
Сделать 3 класса - в каждом классе по краней мере 3 fields
Каждый аттрибут имеет setter и getter
Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
создайте в каждом классе метод printClass() - для вывода всех полей на экран

По крайней мере один атрибут в одном классе должен быть array
Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым.
Объект созданный дефолтовым конструктором заполните при помощи сеттеров
        Выведите на экран эти объекты функцией printClass()*/
