package homework_13;

public class Motherboard {
    private String m_brand;

    public String getM_brand() {
        return m_brand;
    }

    public void setM_brand(String m_brand) {
        this.m_brand = m_brand;
    }

    public Motherboard(String m_brand) {
        this.m_brand = m_brand;
    }

    public void printInfo(){
        System.out.println("Motherboard: " +m_brand);
    }
}
