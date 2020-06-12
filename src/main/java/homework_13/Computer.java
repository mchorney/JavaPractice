package homework_13;

public class Computer {
    private SystemBlock sb;
    private Monitor mon;
    private Keyboard kb;
    private Mouse m;

    public SystemBlock getSb() {
        return sb;
    }

    public void setSb(SystemBlock sb) {
        this.sb = sb;
    }

    public Monitor getMon() {
        return mon;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public Keyboard getKb() {
        return kb;
    }

    public void setKb(Keyboard kb) {
        this.kb = kb;
    }

    public Mouse getM() {
        return m;
    }

    public void setM(Mouse m) {
        this.m = m;
    }

    public Computer(SystemBlock sb, Monitor mon, Keyboard kb, Mouse m) {
        this.sb = sb;
        this.mon = mon;
        this.kb = kb;
        this.m = m;
    }

    public void printInfo(){
        System.out.println("New Computer:");
        sb.printInfo();
        mon.printInfo();
        kb.printInfo();
        m.printInfo();
    }
}
