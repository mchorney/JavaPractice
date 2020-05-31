package hw11;

public class Goods {
    private String tradeName;
    private String country;
    private int quantity;
    private String[] listOfGoods;

    public Goods(String tradeName, String country, int quantity, String[] listOfGoods) {
        this.tradeName = tradeName;
        this.country = country;
        this.quantity = quantity;
        this.listOfGoods = listOfGoods;

    }

    public Goods() {
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getCountry() {
        return country;
    }

    public int getQuantity() {
        return quantity;
    }

    public String[] getListOfGoods() {
        return listOfGoods;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setListOfGoods(String[] listOfGoods) {
        this.listOfGoods = listOfGoods;
    }

    public void printClass() {
        System.out.println("Trade mark is: " + tradeName);
        System.out.println("Made in: " + country);
        System.out.println("Quantity: " + quantity);
        String[] p = this.getListOfGoods();
        for (String v: p){
            System.out.println(v);
        }
    }

}
