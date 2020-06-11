package finalProjectOOP;

public class Wolf extends Carnivores {
    private String name;
    private String socialPosition;

    public Wolf(String name, String socialPosition) {
        this.name = name;
        this.socialPosition = socialPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialPosition() {
        return socialPosition;
    }

    public void setSocialPosition(String socialPosition) {
        this.socialPosition = socialPosition;
    }

    @Override
    public void flesh() {
        System.out.println("I eat flesh. Sometimes...");
    }

    @Override
    public void voice() {
        System.out.println("My name is " + getName() + ". In my pack - I'm " + getSocialPosition());
    }

    @Override
    public void food() {
        System.out.println("Meat!!!!!!!");
    }

    @Override
    public void evolution() {
        System.out.println("I evolve in dog.");
    }

    @Override
    public void canBreath() {
        System.out.println("Yes, I can breath.");
    }
}
