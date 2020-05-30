package homework11;

public class Work {
    public static void main(String[] args) {

        String[] cc = {"Black", "white"};
        Bikes Suz = new Bikes("Suzuki","S1000",cc,2007);
        String[] SSS = Suz.getColor();
        for (String v : SSS) {
            System.out.println(v);
        }
        Suz.setMaker("Kawa");
        Suz.setModel("X1000");
        Suz.setYear(2019);


        Suz.printClass();

        String [] colour = {"Red", "Black","Blue"};
        Bikes h=new Bikes();
        h.setModel("R600");
        h.setMaker("Honda");
        h.setColor(colour);
        String []x=h.getColor();
        for (String v:x) {
            System.out.println(v);
        }
        h.printClass();

        Restaurants w = new Restaurants();
        w.setCousine("German");
        w.setHours("10am-11pm");
        w.setName("Waldhorne");
        w.printClass();

        Cellphones ip = new Cellphones();
        ip.setModel("Iphone");
        ip.setYear(2007);
        ip.setCountry("USA");
        ip.printclass();

        Restaurants b=new Restaurants("Barcelona","11am-11pm","Spain");
        b.printClass();

        Cellphones s = new Cellphones("Samsung",2009,"South Korea");
        s.printclass();

        String [] col = {"White", "Black"};
        Bikes k =new Bikes("Kawasaki","Ninja",col,2020);



         k.printClass();


    }
}
