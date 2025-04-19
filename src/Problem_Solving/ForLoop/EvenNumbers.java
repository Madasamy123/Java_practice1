package Problem_Solving.ForLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

        public static void main(String[] args) {

            List<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            List<Integer> evenNumbers=new ArrayList<>();



            for(int result:numbers){
                if(result%2==0){
                    evenNumbers.add(result);


                }

            }

            System.out.println(evenNumbers);

        }
    }

