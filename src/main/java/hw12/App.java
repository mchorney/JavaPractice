package hw12;

public class App {
    public static void main(String[] args) {
//        #1
        Smartphone last_phone = new Smartphone(Brands.IPHONE,Providers.TMOBILE,Colors.BLACK, new Double[]{5.4, 6.1, 6.4});
        System.out.println(last_phone);


        Smartphone old_phone = new Smartphone(Brands.NOKIA,Providers.SPRINT,Colors.BLUE, new Double[]{3.2,4.1,4.6});
        System.out.println(old_phone);

//        #2

        Speaker bose = new Speaker(Volume.LOUD, "Bose", Sizes.MEDIUM);
        System.out.println(bose);


    }
}
