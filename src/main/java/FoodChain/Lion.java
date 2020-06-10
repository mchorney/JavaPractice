package FoodChain;

public class Lion extends Carnivores{
    private String name;
    private int year;

    public Lion(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
     @Override
    public void mainChar(){
         System.out.println("I am strong and fast and have strong teeth and claws for haunting");
     }

     @Override
    public void hairAndFur(){
         System.out.println("I definetely have Hair or Fur");
     }

     @Override
    public void developedBackbone(){
         System.out.println("I have a well-developed backbone");
     }

     @Override
    public void life(){
         System.out.println("I can breath!");
     }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
