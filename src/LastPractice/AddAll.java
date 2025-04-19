package LastPractice;
import java.util.*;

public class AddAll {
    public static void main(String [] args){

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5));

        a.addAll(b);
        System.out.println(a);

    }
}
