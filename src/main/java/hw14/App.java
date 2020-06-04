package hw14;

public class App {
    public static void main(String[] args) {
        ShowTime dragon = new ShowTime("dragon",true,Brand.ANIMECOMPANY1,8);
        Tv hIWM = new Tv("HWIM",false,Brand.ANIMECOMPANY2,9,"super good");
        Cartoon gG = new Cartoon("GG",true,Brand.ANIMECOMPANY3,10,"Titans");
        C1 corean = new C1("some corean",true,Brand.ANIMECOMPANY3,11,"bb",Company.CoreanCompany1,"made some huge mistake and first didnt get what we talked about then understood.");
        dragon.prinOut();
        hIWM.prinOut();
        gG.prinOut();
        corean.printOut();

    }
}
