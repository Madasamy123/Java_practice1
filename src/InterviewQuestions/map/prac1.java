package InterviewQuestions.map;
import java.util.*;

import java.util.HashMap;

public class prac1 {
    public static void main(String[] args) {
        String str="apple banana apple orange banana apple";

        String [] words=str.split(" ");

        Map<String,Integer>map=new HashMap<>();

        for(String letters: words){
            map.put(letters,map.getOrDefault(letters,0)+1);

        }

        System.out.println(map);


    }
}
