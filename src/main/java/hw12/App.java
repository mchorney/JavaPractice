package hw12;

public class App {
    public static void main(String[] args) {

        Resort HardRockHotel = new Resort("HardRockHotel",County.BREVARD,Beaches.DAYTONA_BEACH,new Amenities[]{Amenities.GYM,Amenities.POOL,Amenities.SPA});
        System.out.println(HardRockHotel);

        Resort Hilton = new Resort ("Hilton", County.MANATEE,Beaches.ANNA_MARIA,new Amenities[]{Amenities.GYM, Amenities.SAUNA, Amenities.FREE_DRINKS, Amenities.POOL});
        System.out.println(Hilton);






    }
}
