package ExamQuestions;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pracQues {
    public static void main(String[] args) {

        List<String>List1=new ArrayList<>(Arrays.asList("Ram","Priya","Suresh","Ram","Karthika","Santhosh","Priya","Ram"));
        List<String>List2=new ArrayList<>(Arrays.asList("Priya","Ram"));



          if (List1 == null || List2 == null) {
              throw new IllegalArgumentException("InvalidArgumentException");
          }
          if (List2.size() > List1.size()) {
//              System.out.println("InvalidArgument Exception");
              throw new IllegalArgumentException("InvalidArgumentException");
          }

          for (int i = 0; i < List2.size(); i++) {
              if (List2.get(i).equals(List2.get(i + 1))) {
                  throw new IllegalArgumentException("InvalidArgumentException");

              }
          }


        Map<String,Integer>count=new HashMap<>();
          for(String item:List1){
             if(List2.contains((item))){
                 count.put(item, count.getOrDefault(item, 0)+1);
              }
          }


          for(String key:List2){
              if(count.containsKey(key)){
                  System.out.println(key+": "+count.get(key));
              }
          }

      }



    }

