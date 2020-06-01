package homework_11;

public class Magazine {
    private String name;
    private String category;
    private String[] publication_frequency;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String[] getPublication_frequency() {
        return publication_frequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPublication_frequency(String[] publication_frequency) {
        this.publication_frequency = publication_frequency;
    }

    public Magazine(String name, String category, String[] publication_frequency) {
        this.name = name;
        this.category = category;
        this.publication_frequency = publication_frequency;
    }
    public Magazine(){}

    public void printOut(){
        System.out.println(name+ "\n" +category);
        String[] array = publication_frequency;
        for (String v:array){
            System.out.println(v);
        }
    }
}
