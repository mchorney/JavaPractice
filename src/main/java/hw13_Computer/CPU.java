package hw13_Computer;

public class CPU {
    private NameOfBrand brand;
    private TypeOfProcessor type;
    private BitSupport bit;

    public CPU(NameOfBrand brand, TypeOfProcessor type,BitSupport bit) {
        this.brand = brand;
        this.type = type;
        this.bit=bit;
    }

    public NameOfBrand getBrand() {
        return brand;
    }

    public void setBrand(NameOfBrand brand) {
        this.brand = brand;
    }

    public TypeOfProcessor getType() {
        return type;
    }

    public void setType(TypeOfProcessor type) {
        this.type = type;
    }

    public BitSupport getBit() {
        return bit;
    }

    public void setBit(BitSupport bit) {
        this.bit = bit;
    }

    public String printInfo(){
        return "Brand = "+brand+" Type = "+type+" Bit Support = "+bit;
    }
}
