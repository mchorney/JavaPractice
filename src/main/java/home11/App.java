package home11;

public class App {
    public static void main(String[] args) {
       Team tom=new Team();
       tom.setName("Tom");
       tom.setlastname("Piterson");
       tom.setteamNumber(23);
       tom.setgender("male");
       tom.printClass();
       Team amanda =new Team("Amanda","Simson",14,"femail");
       amanda.printClass();


       Phone iphone=new Phone();
       iphone.setBrand("iPhone");
       iphone.setModel("Pro11");
       iphone.setMemory(256);
       iphone.setColor("green");
       iphone.printClass();
       String[]colors={"Black","Grey","Silver","White"};
       Phone samsung=new Phone("Samsung","Note 10",512,colors[1]);
       samsung.printClass();


       Movie alone=new Movie();
       alone.settitle("Alone at Home");
       alone.setgenre("comedy");
       alone.settime(90);
       alone.setcountry("USA");
       alone.printOut();
       Movie family=new Movie("Family Story","melodrama",96,"Russia");
       family.printOut();



    }
}
