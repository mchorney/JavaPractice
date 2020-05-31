package homework12;

import java.util.Arrays;

public class FlowerShop {
    private String name;
    private String adress;
    private String phone;
    private FlowerName[] flowersList;

    public FlowerShop(String name, String adress, String phone, FlowerName[] flowersList) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.flowersList = flowersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public FlowerName[] getFlowersList() {
        return flowersList;
    }

    public void setFlowersList(FlowerName[] flowersList) {
        this.flowersList = flowersList;
    }

    public String printFlowerShop() {
        return "FlowerShop{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", flowersList=" + Arrays.toString(flowersList) +
                '}';
    }
}
