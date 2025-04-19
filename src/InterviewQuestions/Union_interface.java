package InterviewQuestions;
import java.util.*;

//Find Union and Intersection
//
//Input: Set A = [1, 2, 3], Set B = [2, 3, 4]
//
//Output: Union = [1, 2, 3, 4], Intersection = [2, 3]

import java.util.Set;
import java.util.TreeSet;

public class Union_interface {
    public static void main(String[] args) {

        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> B = new HashSet<>(Arrays.asList(2, 3, 4));

        Set<Integer>union=new TreeSet<>(A);
        union.addAll(B);

        Set<Integer>intersection=new TreeSet<>(A);
        intersection.retainAll(B);

        System.out.println("Union = " + union);
        System.out.println("Intersection = " + intersection);


    }
}
