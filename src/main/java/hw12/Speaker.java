package hw12;

public class Speaker {
    private Volume volume;
    private String brand;
    private Sizes sizes;

    public Speaker(Volume volume, String brand, Sizes sizes) {
        this.volume = volume;
        this.brand = brand;
        this.sizes = sizes;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "volume=" + volume +
                ", brand='" + brand + '\'' +
                ", sizes=" + sizes +
                '}';
    }
}
