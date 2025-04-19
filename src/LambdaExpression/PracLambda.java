package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracLambda {
    public static void main(String[] args) {
        List<Integer> names= Arrays.asList(4,6,3,2,1,5,7,8);

      Stream<Integer> result=names.stream().filter(x->x%2==0).sorted();

      List<Integer> evenNumbers=result.toList();

        System.out.println("Result: "+evenNumbers);

        List<Integer> output=evenNumbers.stream().map(x->x*2).toList();
        System.out.println("output: "+output);

        output.forEach(ans-> System.out.println("Answer: "+ans));



    }
}
