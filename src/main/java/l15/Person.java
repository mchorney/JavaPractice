package l15;

public abstract class Person {
    protected String name;
    protected String lastName;
    protected int year;

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public abstract String myName();

    public void hello(String yourName){
        System.out.println("Hello "+yourName);
    }

}
