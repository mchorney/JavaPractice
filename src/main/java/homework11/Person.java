package homework11;

public class Person {
    private String name;
    private String last_name;
    private int age;
    private String[] persons_pets;

    //Constructors
    public Person(){}
    public Person(String name, String last_name, int age, String[] persons_pets){
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.persons_pets = persons_pets;
    }
    public Person(String name, String last_name, int age){
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }
    public Person(String[] persons_pets){
        this.persons_pets = persons_pets;
    }
    public Person(String last_name){
        this.last_name = last_name;
    }
    public Person(int age){
        this.age = age;
    }

    // Getters & Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLast_name(){
        return last_name;
    }
    public void setLast_name(){
        this.last_name = last_name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        if(age > 150 || age < 0)
        {
            System.out.println("Please, enter valid age");
        }else
        this.age = age;
    }
    public String[] getPersons_pets(){
        return persons_pets;
    }
    public void setPersons_pets(){
        this.persons_pets = persons_pets;
    }
       public void printClass(){
        System.out.println("Name: " + name + "\nLast name: " + last_name + "\nAge: " + age + "\nPersons pets: " + persons_pets);
    }
       public void printPerson(){
           System.out.println();
    }

}
