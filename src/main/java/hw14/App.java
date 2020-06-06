package hw14;

public class App {
    public static void main(String[] args) {

        Movie parasite = new Movie("Parasite", "Bong Joon-ho", 2019, Genre.DRAMA, " Song Kang-ho, Lee Sun-kyun, Cho Yeo-jeong");
        Show babylon_berlin = new Show ("Babylon-Berlin", "Tom Tykwer", 2017, "3 seasons", Genre.DRAMA);

        parasite.description("Dear cinematography fans!");


        babylon_berlin.description("Hey, Historical Dramas fans! We have a great news for you");
        babylon_berlin.printMe();




    }


}
