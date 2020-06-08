package hw15;

public class App {
    public static void main(String[] args) {
        Pencil regular_pencil = new Pencil(What.PENCIL, Type.MECHANICAL, Color.GREY);
        Cheating from_someone = new Cheating(How.FROM_SOMEONE, "march,6 2020 at 1.55 pm");

        Pencil pen = new Pencil(What.PEN, Type.OTHER, Color.OTHER);
        Cheating no_cheating = new Cheating(How.NO_CHEATING, "during the whole testing");

//        regular_pencil.noCheating("as required");
//        from_someone.noCheating("Test can be retaken next semester");
//        from_someone.whatToDo();


        no_cheating.passed();

//        pen.written();
    }


}






