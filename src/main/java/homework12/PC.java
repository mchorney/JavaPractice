package homework12;

import java.security.Key;

public class PC {
    private SystemBlock block;
    private Mouse mouse;
    private Keybord keyboard;
    private Monitor monitor;

    public PC(SystemBlock block, Mouse mouse, Keybord keyboard, Monitor monitor) {
        this.block = block;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public SystemBlock getBlock() {
        return block;
    }

    public void setBlock(SystemBlock block) {
        this.block = block;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keybord getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keybord keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void printInfo() {
//
        block.printInfo();
        monitor.printInfo();
        keyboard.printInfo();
        mouse.printInfo();

    }
}
