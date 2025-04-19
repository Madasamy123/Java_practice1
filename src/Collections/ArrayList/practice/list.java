package Collections.ArrayList.practice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {

        List<String>names=new LinkedList<>();
        names.add("maddy");
        names.add("bala");

        List<String>department=new ArrayList<>();
        department.add("mech");
        department.add("eee");

        // names.remove(1);

        // names.clear();

        // names.addAll(department);


        // System.out.print( names.get(0));
        // System.out.print(department.size());


        names.set(1,"sudharsan");

        names.add("bala");
        names.add("saravana");
        names.add("bala");

        // System.out.println(names.lastIndexOf("bala"));

        //   System.out.println(names.get(1).equals("sudharsan"));



        // System.out.print(names.hashCode());

        // names.clear();

        //  System.out.print(names.isEmpty());

        //  System.out.print(names.contains("bal"));

        // System.out.print(names);


        List<String>names2=new ArrayList<>();
        names2.add("maddy");
        names2.add("sudharsan");
        names2.add("bala");
        names2.add("saravana");
        names2.add("bala");


        System.out.print(names.containsAll(names2));




    }
}
