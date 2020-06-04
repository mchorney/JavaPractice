package hwLesson14;

public class App {
    public static void main(String[] args){
        Brabus car2 = new Brabus("BRABUS", "12cylinder",900,"POWERXTRA B40-700","SPORT EXHAUST SYSTEM");
        car2.brabusInfo();
        Amg car3 = new Amg("bose","2.0L inline-4 turbo",221,"*AMG body styling","*AMG Illuminated running boards",Roof.PANORAMA);
        car3.amgInfo();
        // call function with the same name
        Mercedes newMercedes = new Mercedes();
        newMercedes.sameName();
        car2.sameName();

        }
    }
