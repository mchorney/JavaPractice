package h19;

public class AgreeCultural {
    private String nameofCulture;
    private int fiedlsNumber;

    public AgreeCultural(String nameofCulture, int fiedlsNumber) {
        this.nameofCulture = nameofCulture;
        this.fiedlsNumber = fiedlsNumber;
    }

    public String getNameofCulture() {
        return nameofCulture;
    }

    public void setNameofCulture(String nameofCulture) {
        this.nameofCulture = nameofCulture;
    }

    public int getFiedlsNumber() {
        return fiedlsNumber;
    }

    public void setFiedlsNumber(int fiedlsNumber) {
        this.fiedlsNumber = fiedlsNumber;
    }

    public void printInfo() {
        System.out.println("Culture " + nameofCulture + ", fields # " + fiedlsNumber);
    }
}

