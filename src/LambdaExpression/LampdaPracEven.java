package LambdaExpression;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LampdaPracEven {

    public static void main(String[] args) {

        List<Integer> numbers=Arrays.asList(11,68,23,64,15,86,17,58,39,13);

        //  normal

//        List<Integer> evenNumbers=new ArrayList<>();

//        for(int result:numbers){
//            if(result%2==0){
//                evenNumbers.add(result);
//            }
//        }
//        System.out.println(evenNumbers);


        // lambda expression

//        numbers.forEach(n->{
//            if(n%2==0) {
//                System.out.println(n);
//            }
//
//        }
//        );


   List<Integer> data=numbers.stream().filter(n -> n % 2 == 0).sorted().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(data);



    }
}
