package hw15;

public class Cheating implements Test {
    private How how;
    private String when;

    public Cheating(How how, String when) {
        this.how = how;
        this.when = when;
    }


    @Override
    public String written() {
        return "Cheating was detected on" + when + "student cheated from " + how;
    }

    @Override
    public void noCheating(String What) {
        System.out.println("This test is failed because student was cheating on " + "from " + What);

    }

    public void whatToDo() {
        System.out.println("If you failed this test due to cheating from " + how + " please come back next semester");


    }

    public void passed() {
        System.out.println("You passed the test!" + how + " was detected");

    }
}
