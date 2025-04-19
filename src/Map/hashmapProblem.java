package Map;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.*;

public class hashmapProblem {
    public static void main(String[] args) {
        HashMap<String,Integer>Names=new HashMap<>();
        Names.put("Maddy",25);
        Names.put("bala",15);
        Names.put("Sudharsan",30);
        Names.put("senthil",30);
        Names.put("sarava",10);

        int sum=0;

        for(int answer:Names.values()){
            sum+=answer;

        }

//        System.out.println(sum);

        //----------------------------tree map------------------------------


        TreeMap <String,Integer> List=new TreeMap<>();
        List.put("Maddy",25);
        List.put("bala",15);
        List.put("Sudharsan",30);
        List.put("senthil",30);
        List.put("sarava",10);

        List.put("bala",List.get("bala")+25);
        System.out.println("update Value: "+List);

        System.out.println("Check: "+List.containsKey("Sudharsan"));

       for(Integer Details:List.values()){
           System.out.println("Names: "+Details);




       }









    }
}
