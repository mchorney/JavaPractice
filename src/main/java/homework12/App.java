package homework12;

public class App {
    public static void main(String[] args) {
        Device phone = new Device("phone", PhoneModel.SAMSUNG, "silver");
        System.out.println(phone);

        Cars toyota = new Cars("Toyota", "Prius", 2012, new Colors[]{Colors.BLACK, Colors.BLUE, Colors.GRAY, Colors.RED});
        System.out.println(toyota);
    }
}

