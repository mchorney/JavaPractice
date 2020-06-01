package hw12;

public class App {
    public static void main(String[] args) {
        Computer lenovo = new Computer(" lenovo ",50,F1.Blue);
        System.out.println(lenovo);

        movies terminator = new movies("Holiwood", "amc", new Zhaner[]{Zhaner.Action, Zhaner.Fantasy, Zhaner.Horror, Zhaner.Romance });
        System.out.println(terminator);
    }
}
