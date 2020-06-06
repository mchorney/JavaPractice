package hw15;

public class Pencil implements Test {
    private What what;
    private Type type;
    private Color color;

    public Pencil(What what, Type type, Color color) {
        this.what = what;
        this.type = type;
        this.color = color;
    }

    @Override
    public void NoCheating(String What) {
        System.out.println("This test is passed, it has 90% of right answers, it's completed with " + type + what + color + " color, and no Cheating was detected");
    }


    public String Written() {
        return "This test is failed, because it was completed with" + what + color + " color";
    }

    public void Rules() {
        System.out.println("This test is must be written with " + what + ". Any Cheating will disqualify you");


    }
}
