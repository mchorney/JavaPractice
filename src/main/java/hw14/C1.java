package hw14;

public class C1 extends Cartoon {
    private Company company;
    private String name;

    public C1(String animeName, boolean kidType, Brand brand, int timeOfShow, String name, Company company, String name1) {
        super(animeName, kidType, brand, timeOfShow, name);
        this.company = company;
        this.name = name1;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void printOut(){
        System.out.println("Corean Cartoon");
    }
}
