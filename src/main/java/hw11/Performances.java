package hw11;

import java.util.Arrays;

public class Performances {
    private String name;
    private String[] places;
    private String[] genres;
    private int[] tickets;

    public Performances(){}
    public Performances(String n, String[] p, String[] g, int[] t){
        name=n;
        places=p;
        genres=g;
        tickets=t;
    }

    public void printOut(){
        System.out.println("Name = " +name + "\nPlaces = " + Arrays.toString(places) + "\nGenres = " + Arrays.toString(genres) + "\nPrices = " + Arrays.toString(tickets) + "\n");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public void setPlaces(String[] places) {
        this.places = places;
    }

    public void setTickets(int[] tickets) {
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public int[] getTickets() {
        return tickets;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getPlaces() {
        return places;
    }
}
