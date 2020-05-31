package home12;

public class App {
    public static void main(String[] args) {
        Travel vacation=new Travel(State.COLORADO,"with my family",Transport.CAR);
        System.out.println(vacation.toString());

        Travel trip=new Travel(State.MINNESOTA," with my friends",Transport.PLANE);
        System.out.println(trip.toString());


        Team cardinals=new Team(new Game[]{Game.BASKETBALL,Game.FOOTBALL,Game.GOLF,Game.SOCER},State.MINNESOTA);
        System.out.println(cardinals.toString());
        Team twinSites=new Team(new Game[]{Game.FOOTBALL,Game.HOCKEY,Game.GOLF},State.NEVADA);
        System.out.println(twinSites.toString());
    }
}
