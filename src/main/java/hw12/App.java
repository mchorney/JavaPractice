package hw12;

/*
Сделать Enum (или 2 enum)
Сделать 2 класса - в первом классе поле сделать типа Enum
Во  втором классе - Поле типа Enum[]
 */

public class App {

    public static void main(String[] args) {

        Phone iPhoneXS = new Phone("iPhone X", Brand.APPLE);
        System.out.println(iPhoneXS.printPhone());

        Color[] iPadColors = {Color.BLACK, Color.SILVER};
        Tablet iPadPro11 = new Tablet("iPad Pro 11", iPadColors);
        System.out.println(iPadPro11.printTablet());
    }
}
