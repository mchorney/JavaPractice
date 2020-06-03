package hw14;

/*
1. Создать один супер и 2 или 3 детских
создать объекты
2. Попробуйте создать функцию в супер классе и в произвлдном классе с одинаковым именем и разным функционалом
 */

public class App {

    public static void main(String[] args) {

        Bag murphy = new Bag(Color.BLUE, Fabric.SILK, 50, BagType.BACKPACK);
        murphy.printMe();
        Belt poppy = new Belt(Color.PINK, Fabric.LEATHER, 25, Size.M);
        poppy.printMe();
        Hat nature = new Hat(Color.YELLOW, Fabric.LINEN, 30, HatType.BUCKET, Season.SUMMER);
        nature.printMe();
    }
}
