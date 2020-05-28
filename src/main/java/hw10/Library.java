package hw10;

import org.w3c.dom.ls.LSOutput;

public class Library {

    public String book_name;
    public String genre;
    public String section_name;
    public int row;

    public void setRow(int c) {
        System.out.println("Set Row " + c + " for book " + book_name + " in " + section_name);


    }
    public void bring () {
        System.out.println( "Bring me please " + book_name + " from the " + section_name + " row " + row);

    }




}
