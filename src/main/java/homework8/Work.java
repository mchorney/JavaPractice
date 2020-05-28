package homework8;

public class Work {
    public static void main(String[] args) {

        Pets Duke = new Pets();
        Duke.age=3;
        Duke.breed="Lab";
        Duke.name = "Duke";
        Duke.type = "Dog";
        Pets Lemon = new Pets();
        Lemon.type = "Cat";
        Lemon.name = "Lemon";
        Lemon.breed = "Russian";
        Lemon.age = 1;
        Duke.petcard();
        Lemon.petcard();
        Stores HD = new Stores();
        HD.name = "Home Depot";
        HD.zipCode = 28277;
        HD.bisnesshours = "7am-10pm";
        HD.wine=false;
        Stores P=new Stores();
        P.wine=true;
        P.bisnesshours="24/7";
        P.zipCode=28105;
        P.name="Publix";
        P.city="Matthews";
        Stores TJ= new Stores();
        TJ.name="Trader Joe's";
        TJ.zipCode=28202;
        TJ.bisnesshours="8am-8pm";
        TJ.wine=true;
        TJ.city="Charlotte";
        TJ.wcard();
        P.wcard();
        Wines PN=new Wines();
        PN.year=2006;
        PN.country="France";
        PN.color="red";
        PN.sort="Pinot noir";
        PN.blank(10);
        Wines Ch= new Wines();
        Ch.sort="Chardonne";
        Ch.color="white";
        Ch.country="Italy";
        Ch.year=2009;
        Ch.blank(25);
        Houses Home1=new Houses();
        Home1.square=2000;
        Home1.levels=2;
        Home1.neborhood="Brightmoore";
        Home1.name="Izbushka";
        Home1.realtor="John Black";
        Houses Home2=new Houses();
        Home2.realtor="Paul Davis";
        Home2.name="Palace";
        Home2.neborhood="Grove";
        Home2.levels=1;
        Home2.square=1500;
        Home1.homecards();
        Home2.presenter();




   }
}
