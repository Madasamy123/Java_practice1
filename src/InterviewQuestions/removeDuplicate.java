package InterviewQuestions;
import java.util.*;

import java.util.TreeSet;

public class removeDuplicate {
    public static void main(String [] args){
        int [] arr={1,5,2,1,6,2,7,3,8,5};

        Set<Integer> result=new TreeSet<>();

        for(int i=0;i<arr.length;i++){
            result.add(arr[i]);

        }

        System.out.print(result);
    }
}

//public class removeDuplicate {
//    public static void main(String [] args){
//        int [] arr={1,5,2,1,6,2,7,3,8,5};
//
//        List<Integer>newArr=new ArrayList<>();
//
//        for(int i=0;i<arr.length;i++){
//           if(!newArr.contains(arr[i])){
//               newArr.add(arr[i]);
//           }
//        }
//
//        System.out.print(newArr);
//
//    }
//}
