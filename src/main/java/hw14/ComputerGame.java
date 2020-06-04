package hw14;

public class ComputerGame extends Game{
    private String requirements;
    private Store store;

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public ComputerGame(String name, int year, Type type, int numberOfPeople, String requirements, Store store) {
        super(name, year, type, numberOfPeople);
        this.requirements = requirements;
        this.store = store;
    }

    @Override
    public void printInfo() {
        System.out.println("Computer Game{" +
                "Name='" + name + '\'' +
                ", Year=" + year +
                ", Type=" + type +
                ", For number of people=" + numberOfPeople + "\n" +
                store +
                '}');
    }
}
