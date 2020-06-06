package les15;

public class App {
    public static void main(String[] args) {
        Lights lights=new Lights(5000);
        Bulb deskLight = new TableLight("Super","tristar",25,3000);
        //lights=deskLight;

        Bulb l1 = new TableLight("Super","FourStar",30,4000);
        Plug l2 = new TableLight("Super","FiveStar",35,5000);

        BathLight bathLight = new BathLight("Superbath","SB",25,5000);
        Bulb[] b={l1,bathLight,deskLight};

//        String xx="yyy";
//        xx.length();

        deskLight.e27();
        bathLight.e27();


        }
    }

