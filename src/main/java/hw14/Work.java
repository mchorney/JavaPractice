package hw14;

public class Work {
    public static void main(String[] args) {
        Shoes nike = new Sneakers("Nike",Size.EU37,ForWho.WOMAN,Season.DEMISEASON,500,"Roshe Run",TypeOfSnickers.RUNNING,true);
        System.out.println(nike.toString());
        Shoes vans = new Sneakers("Vans",Size.EU40,ForWho.MAN,Season.DEMISEASON, 300,"Slip Ons",TypeOfSnickers.SKATE,false);
        System.out.println(vans.toString());
        Shoes allSaints= new Boots("All Saints",Size.EU40,ForWho.MAN,Season.WINTER,400,Material.LEATHER,false);
        System.out.println(allSaints.toString());
        Shoes drMartens = new Boots("Dr.Martens",Size.EU38,ForWho.WOMAN,Season.WINTER,170,Material.SUEDE,true);
        System.out.println(drMartens.toString());
        Shoes slippers= new Slippers("Made In China",Size.EU36,ForWho.WOMAN,Season.SUMMER,15,TypeOfSlippers.FLIP_FLOPS);
        slippers.printMe();
        Shoes gucci = new Slippers("Gucci",Size.EU36,ForWho.WOMAN,Season.SUMMER,480,TypeOfSlippers.DESIGNER_SLIPPERS);
        gucci.printMe();
    }
}
