package LastPractice;
import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {


//        Input: [1, 2, 3, 2, 4, 1]
//
//        Output: [1, 2]

        int [] arr = {1, 2, 3, 2, 4, 1};
        List<Integer>newarr=new ArrayList<>();


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    newarr.add(arr[i]);
                }
            }

        }

        System.out.println(newarr);





    }
}
