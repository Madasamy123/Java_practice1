package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamPridicate {
    public static void main(String[] args) {
        List<String>Studentsnames= new ArrayList<>(Arrays.asList("Alice","Bob","Maddy","Sudharsan","Pugal"));

        Predicate<String>StartwithA=names->names.startsWith("A");

        Studentsnames.removeIf(StartwithA);



        System.out.println(Studentsnames);

    }
}
