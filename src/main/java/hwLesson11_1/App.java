package hwLesson11_1;

public class App {
    public static void main(String []args){
        Googles forManOakley= new Googles("Oakley",new String[]{"Male"}, 150);
        Googles forLadyOakley= new Googles("Oakley",new String[]{"Female"}, 150);

        forManOakley.printClass();
        forLadyOakley.printClass();
//--------------------SHOES-----------------------
        String[] color = {"Red"};
        Shoes forLadyShoes = new Shoes("Puma",color,100);
        forLadyShoes.printClass();
        Shoes forManShoes = new Shoes("Puma",color,95);
        forManShoes.setColor(new String[]{"Yellow"});
        forManShoes.printClass();

//--------------------SOCKS------------------------
        Socks forLadySocks = new Socks("Smartwool",new int[]{5},60);
        Socks forManSocks = new Socks("Smartwool",new int[]{9}, 70);
        forLadySocks.printClass();
        forManSocks.printClass();
    }
}
