package homework11;

public class App {
    public static void main(String[] args) {
        String[] col = {"blue", "green", "red"};
        int[] size = {8, 9, 10};
        Clothes dress = new Clothes();
        dress.setType("dress");
        dress.setColor(col);
        dress.setSize(size);


        Clothes gloves = new Clothes("gloves", col, size);
//        String[] c = dress.getColor();
//        for (String v : c) {
//            System.out.println(v);
//        }
//            int[] s = dress.getSize();
//            for (int v : s) {
//                System.out.println(v);
//            }
            dress.printClass();
            gloves.printClass();


                Pet dog = new Pet();
                dog.setType("dog");
                dog.setName("Bim");
                dog.setBreed("Poodle");
                Pet cat = new Pet("cat", "Musya", "Abyssinian");

                dog.printClass();
                cat.printClass();


                Skincare cream = new Skincare();
                cream.setBrand("Mary Kay");
                cream.setTypeOfSkin("dry and oily");
                cream.setPurpose("agefighting");
                Skincare soap = new Skincare("Nivea", "all", "cleansing");

                cream.printClass();
                soap.printClass();

            }

        }
