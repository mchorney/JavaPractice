package hw14;

public class Snake extends Animal{
    boolean poison;

    public Snake(String name, String color, boolean vegetarian, boolean poison) {
        super(name, color, vegetarian);
        this.poison = poison;
    }

    public boolean isPoison() {
        return poison;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }


    @Override
    public void printAnimal(){
        System.out.println("Snake{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian + '\'' +
                ", poison='" + poison +
                '}');
    }
}
