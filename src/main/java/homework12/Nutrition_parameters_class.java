package homework12;

public class Nutrition_parameters_class {
    public static boolean isCalories;
    private Nutrition_parameters np;

    public Nutrition_parameters getNp() {
        return np;
    }

    public void setNp(Nutrition_parameters np) {
        this.np = np;
    }

    public Nutrition_parameters_class(Nutrition_parameters np) {
        this.np = np;
    }

    public String printInfo(){
        return "Parameter of choice: " +np;
    }

    public boolean isCalories() {
        return np == Nutrition_parameters.CALORIES;
    }
}
