package LambdaExpression.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PractComparator {
    public static void main(String[] args) {


        ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(34,65,12,45,19));

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
