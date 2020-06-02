package lesson11hw10;

public class creditcard {
    private String[]banks;
    private String name;
    private int expiireDate;

    public creditcard(String[] bank, String name, int expiireDate) {
        this.banks = bank;
        this.name = name;
        this.expiireDate = expiireDate;
    }

    public creditcard() {
    }

    public String[] getBank() {
        return banks;
    }

    public void setBank(String[] bank) {
        this.banks = bank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpiireDate() {
        return expiireDate;
    }

    public void setExpiireDate(int expiireDate) {
        this.expiireDate = expiireDate;
    }
    public void printClass(){
        System.out.println("name = "+name);
        for (String bank:this.banks) {
            System.out.println(bank);

        }

    }
}
