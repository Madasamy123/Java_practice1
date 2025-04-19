package InterviewQuestions;

import java.util.ArrayList;
import java.util.*;

public class removedup {
    public static void main(String [] args){
        int [] arr={1,3,1,2,4,3,5,3};

        Set<Integer>newarr=new TreeSet<>();

        for(int i=0;i<arr.length;i++){
            newarr.add(arr[i]);
        }

        System.out.println(newarr);


    }
}
