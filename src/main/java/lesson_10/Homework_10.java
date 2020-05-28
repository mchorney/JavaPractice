package lesson_10;
//1. Создайте 4 класса в которых есть поля (fields) и методы (methods)
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают
public class Homework_10 {
    public static void main(String[] args) {
        Dog gandalf = new Dog();
        gandalf.name = "Gandalf";
        gandalf.breed = "Shiba inu";
        gandalf.weight=25;

        gandalf.bark();
        gandalf.beg_for_food();
        int food_amount = gandalf.food_calculator(gandalf.weight);
        System.out.println("Dog name " +gandalf.name+ " should eat " +food_amount+ " cup of food a day. Please do not pig out your dog!");

        Dog balto = new Dog();
        balto.name = "Balto";
        balto.breed = "Akita inu";
        balto.weight=85;

        balto.bark();
        balto.beg_for_food();

        Cat misty = new Cat();
        misty.name = "Misty";
        misty.age = 2;
        misty.hello();

        Cat pickle = new Cat();
        pickle.name = "Pickle";
        pickle.age = 5;
        pickle.hello();

        Plant petunia = new Plant();
        petunia.name = "Petunia";
        petunia.is_indoor = false;
        petunia.setIs_indoor(false);

        Plant saintpaulia = new Plant();
        saintpaulia.name = "Saintpaulia";
        saintpaulia.is_indoor = true;
        saintpaulia.setIs_indoor(true);

        Telephone samsung_galaxy_s10 = new Telephone();
        samsung_galaxy_s10.model = "Samsung Galaxy s10";
        samsung_galaxy_s10.processor = "Snapdragon 855";
        samsung_galaxy_s10.year = 2019;
        samsung_galaxy_s10.print_info();

        Telephone samsung_galaxy_s20 = new Telephone();
        samsung_galaxy_s20.model = "Samsung Galaxy s20";
        samsung_galaxy_s20.processor = "Snapdragon 865";
        samsung_galaxy_s20.year = 2020;
        samsung_galaxy_s20.print_info();
    }
}
