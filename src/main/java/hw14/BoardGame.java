package hw14;

public class BoardGame extends Game{
    private String company;
    private Store store;

    public BoardGame(String name, int year, Type type, String author, int numberOfPeople, String company, Store store) {
        super(name, year, type, author, numberOfPeople);
        this.company = company;
        this.store = store;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public void printInfo() {
        System.out.println("Board Game{" +
                "Name='" + name + '\'' +
                ", Year=" + year +
                ", Type=" + type +
                ", Company='" + company + '\'' +
                ", For number of people=" + numberOfPeople + "\n" +
                store +
                '}');
    }
}
