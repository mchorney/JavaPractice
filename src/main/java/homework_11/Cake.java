package homework_11;

public class Cake {
    private String name;
    private String size;
    private String[][] nutrition_value;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String[][] getNutrition_value() {
        return nutrition_value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNutrition_value(String[][] nutrition_value) {
        this.nutrition_value = nutrition_value;
    }

    public Cake(String name, String size, String[][] nutrition_value) {
        this.name = name;
        this.size = size;
        this.nutrition_value = nutrition_value;
    }

    public Cake(){}

    public void printOut(){
        System.out.println("Cake's name = " +name+ " \nSize = " +size);
        String[][] array = nutrition_value;

        System.out.println(array[0][0] + array[1][0] + " g");
        System.out.println(array[0][1] + array[1][1]+ " kcal");
        System.out.println(array[0][2] + array[1][2]+ " g");
        System.out.println(array[0][3] + array[1][3]+ " g");
        System.out.println(array[0][4] + array[1][4]+ " g");

    }
}
