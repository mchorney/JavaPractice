package hw15;

public class Lightning implements Storm {
    private int flashAmount;
    private int voltageMlnV;
    private String thunderSound;
    private boolean thunderSoundIsPresented;
    private static int count;


    public Lightning() {
    }

    public Lightning(int flashAmount, int voltageMlnV, String thunderSound, boolean thunderSoundIsPresented) {
        this.flashAmount = flashAmount;
        this.voltageMlnV = voltageMlnV;
        this.thunderSound = thunderSound;
        this.thunderSoundIsPresented = thunderSoundIsPresented;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public int getFlashAmount() {
        return flashAmount;
    }

    public void setFlashAmount(int flashAmount) {
        this.flashAmount = flashAmount;
    }

    public int getVoltageMlnV() {
        return voltageMlnV;
    }

    public void setVoltageMlnV(int voltageMlnV) {
        this.voltageMlnV = voltageMlnV;
    }

    public String getThunderSound() {
        return thunderSound;
    }

    public void setThunderSound(String thunderSound) {
        this.thunderSound = thunderSound;
    }

    public boolean isThunderSoundIsPresented() {
        return thunderSoundIsPresented;
    }

    public void setThunderSoundIsPresented(boolean thunderSoundIsPresented) {
        this.thunderSoundIsPresented = thunderSoundIsPresented;
    }

    @Override
    public void beginning() {
        System.out.println("Lightning explosion.");
    }

    @Override
    public void finishing() {
        System.out.println("Lightning fading away.");
    }

    @Override
    public void continued() {
        System.out.println("Lightning radiance.");
    }

    public void conclusion() {
        System.out.println("Lightning is awesome.");
    }
}
