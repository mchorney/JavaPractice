package hw10;

public class Work {
    public static void main(String[] args) {
        Decorative_pillow a=new Decorative_pillow();
        a.color="blue";
        a.phrase="Be Awesome!";
        a.condition="new";
        a.newPhrase();

       Decorative_pillow b=new Decorative_pillow();
       b.color="white";
       b.phrase="Feel Summer";
       b.condition="used";
       b.newColor();

        System.out.println("------------------------------------------------------------");

        TV samsung=new TV();
        samsung.brand="Samsung";
        samsung.price=2600;
        samsung.SmartOrNot="SmartTV";
        samsung.sizeInches=65;
        samsung.motionRate=240;
        samsung.sale(30);
        samsung.blackFriday();

        TV sony=new TV();
        sony.brand="Sony";
        sony.price=499.99;
        sony.SmartOrNot="No SmartTV";
        sony.sizeInches=55;
        sony.motionRate=240;
        sony.sale(80);
        sony.blackFriday();

        System.out.println("------------------------------------------------------------");

        IPhone ip8=new IPhone();
        ip8.model="8 Plus";
        ip8.color="Rose Gold";
        ip8.condition="used";
        ip8.memoryGB=64;
        ip8.year=2017;
        ip8.congrats();
        ip8.iBought();

        IPhone ip11=new IPhone();
        ip11.model="11 Pro Max";
        ip11.memoryGB = 132;
        ip11.year=2019;
        ip11.condition="new";
        ip11.color="Military Green";
        ip11.congrats();
        ip11.iBought();

        System.out.println("------------------------------------------------------------");

        Food pineapple=new Food();
        pineapple.type="fruit";
        pineapple.name="Pineapple";
        pineapple.amountInGrams=2650;
        pineapple.ccalPer100gramm=50;
        pineapple.countCcal();
        pineapple.typePrint();

        Food cherryPie=new Food();
        cherryPie.type="dish";
        cherryPie.name="Cherry Pie";
        cherryPie.ccalPer100gramm=296;
        cherryPie.amountInGrams=625;
        cherryPie.countCcal();
        cherryPie.typePrint();


    }
}
