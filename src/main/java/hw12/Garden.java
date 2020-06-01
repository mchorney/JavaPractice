package hw12;

public class Garden {
    private String name;
    private Trees trees;
    private String address;

    public Garden(String name, Trees trees, String address) {
        this.name = name;
        this.trees = trees;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trees getTrees() {
        return trees;
    }

    public void setTrees(Trees trees) {
        this.trees = trees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "name='" + name + '\'' +
                ", trees=" + trees +
                ", address='" + address + '\'' +
                '}';
    }
}
