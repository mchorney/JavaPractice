package hw12;

public class Work {
    public static void main(String[] args) {
        //Colors car = Colors.GRAY;
        //S nikeAir = new S("Nike", "Air", new Colors[] {Colors.GRAY, Colors.BLACK});
        //Colors color =
        Cat cat1 = new Cat(Colors.BLACK,"Scotland", "Murzik");
        Cat cat2 = new Cat(Colors.GRAY,"Russian Blue", "Murka");
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        //----------------------------------
        Dog dog1 = new Dog (new Colors[] {Colors.GRAY,Colors.BLACK,Colors.WHITE},"Doberman", "Hamburger");
        Dog dog2 = new Dog (new Colors[] {Colors.ORANGE,Colors.BLACK,Colors.WHITE},"Jack-Rassel", "Jassie");
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
    }
}
