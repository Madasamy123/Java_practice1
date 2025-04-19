package Collections.ArrayList;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String>StudentsNames=new Vector<String>();
        StudentsNames.add("maddy");
        StudentsNames.add("sudhan");
        StudentsNames.add("pugal");
        StudentsNames.add("bala");
        StudentsNames.add("senthil");
        StudentsNames.add("sarava");


        System.out.println("Names: "+StudentsNames);


        System.out.println("First Name: "+StudentsNames.get(0));
        System.out.println("Remove SecondName: "+StudentsNames.remove(1));
        System.out.println("Check Students: "+StudentsNames.contains("saravana"));
        System.out.println("Updated Names: " + StudentsNames);

    }
}
