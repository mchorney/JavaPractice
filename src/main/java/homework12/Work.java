package homework12;

public class Work {
    public static void main(String[] args) {
        Motherboard asus = new Motherboard("Asus","GX-100KA",SocketType.Intel);
        Motherboard msi = new Motherboard("MSI","XA-009",SocketType.AMD);
        Processor i7 = new Processor(SocketType.Intel,4,"i7-gen10");
        Processor i5 = new Processor(SocketType.Intel,4,"i5-gen10");
        Processor r5 = new Processor(SocketType.AMD,6,"Ryzen5");
        Processor r7 = new Processor(SocketType.AMD,8,"Ryzen7");
        Processor a = new Processor(SocketType.Other,4,"ARM");

        Monitor acer=new Monitor ("Acer",28,"FullHD");
        Monitor aoc= new Monitor ("AOC",24,"4K");

        Keybord hp=new Keybord ("HP","Black");
        Keybord log=new Keybord("Logitech","Black");

        Mouse h=new Mouse("Optic","HP");
        Mouse l=new Mouse("Laser","Logitech");
        Mouse [] mouses = {h,l};

        SystemBlock de=new SystemBlock(asus,i7,"16Gb",512);
        SystemBlock ac=new SystemBlock(asus,r7,"32Gb",1024);


        PC dell = new PC(de,mouses[1],log,aoc);
        dell.printInfo();
    }
}
