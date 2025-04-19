package LastPractice;

import java.util.Arrays;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4,6, 4, 5);

//        Set<Integer>result=new TreeSet<>(list);
        Set<Integer>result=new TreeSet<>();

        for(int i=0;i<list.size();i++){
            result.add(list.get(i));
        }

        System.out.println(result);



    }
}
