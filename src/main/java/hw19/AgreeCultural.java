package hw19;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldsNumber;

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldsNumber() {
        return fieldsNumber;
    }

    public AgreeCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public void setFieldsNumber(int fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }

    public String forPrint() {
        return nameOfCulture + " - " + fieldsNumber + " fields";
    }
}
