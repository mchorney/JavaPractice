package hw12;

import java.util.Arrays;

public class Smartphone {
    private Brands brands;
    private Providers providers;
    private Colors colors;
    private Double[] screen_size;


    public Smartphone(Brands brands, Providers providers, Colors colors, Double[] screen_size) {
        this.brands = brands;
        this.providers = providers;
        this.colors = colors;
        this.screen_size = screen_size;
    }

    public Brands getBrands() {
        return brands;
    }

    public Providers getProviders() {
        return providers;
    }

    public Colors getColors() {
        return colors;
    }

    public Double[] getScreen_size() {
        return screen_size;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brands=" + brands +
                ", providers=" + providers +
                ", colors=" + colors +
                ", screen_size=" + Arrays.toString(screen_size) +
                '}';
    }

    public void printOut() {
        System.out.println("Brands = " + this.brands + "\nProviders = " + this.providers + "\nColors =" + this.colors);
        for (Double screen_size : this.screen_size) {
            System.out.println(screen_size);
        }
    }
}


