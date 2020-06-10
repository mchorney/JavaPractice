package hw19;

public class AgriCultural {
    private String nameOfCulture;
    private int fieldNumber;

    public AgriCultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    void getCulture(){
        System.out.println(nameOfCulture+ " "+ fieldNumber);
    }

    public void printAgreecult (){
        System.out.println("AgriCultural{" +
            "Name Of Culture='" + nameOfCulture + '\'' +
                    ", fieldNumber=" + fieldNumber +
                    '}');
    }







}
