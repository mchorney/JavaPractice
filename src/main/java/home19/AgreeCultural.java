package home19;

 class AgreeCultural {
    private String nameofCulture;
    private int fielsNumber;

    public AgreeCultural(String nameofCulture, int fielsNumber) {
        this.nameofCulture = nameofCulture;
        this.fielsNumber = fielsNumber;
    }

    public String getNameofCulture() {
        return nameofCulture;
    }

    public void setNameofCulture(String nameofCulture) {
        this.nameofCulture = nameofCulture;
    }

    public int getFielsNumber() {
        return fielsNumber;
    }

    public void setFielsNumber(int fielsNumber) {
        this.fielsNumber = fielsNumber;
    }
    public void printInfo(){
        System.out.println("Culture "+nameofCulture+", fields # "+fielsNumber);
    }
}
