package hwk19;

public class AgreeCultural {
    private String nameOfCulture;
    private int fieldNumber;

    public AgreeCultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public String getAgreecultural(){
        return nameOfCulture + " : " + fieldNumber;

    }
}
