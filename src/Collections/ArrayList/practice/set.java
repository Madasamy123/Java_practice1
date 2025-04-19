package Collections.ArrayList.practice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class set {
    public static void main(String[] args) {

        HashSet<String>names=new HashSet<>();

        names.add("maddy");
        names.add("sudharsan");
        names.add("senthil");
        names.add("pugal");

        // names.remove("senthil");


        //   names.clear();

        //   System.out.print(names.contains("pugal"));

        //   System.out.print(names.isEmpty());

        // System.out.print(names.contains("pugal"));

        //   System.out.print(names.size());


        //   System.out.print(names.clone());


        Iterator <String> iterator=names.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }





    }
}