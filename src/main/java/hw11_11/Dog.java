package hw11_11;

public class Dog {
    private String[] owners;
    private String name;

    public Dog(String[] owners, String name) {
        this.owners = owners;
        this.name = name;
    }

    public Dog() {
    }

    public String[] getOwners() {
        return owners;
    }

    public void setOwners(String[] owners) {
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMe(){
        System.out.println("Name = "+ name);
        for (String owner:this.owners) {
            System.out.println(owner);

        }
    }
}
