package hw12;



public class App {
    public static void main(String[] args) {
        Client Nick = new Client("Nick", 2,Gyms.LAFITNESS);

        Nick.printOut();

        Trainer Vlad = new Trainer("Vlad",50,4.9,new WorkoutType[]{WorkoutType.CARDIO});

        Vlad.printOut();


    }
}