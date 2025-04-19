package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class differentReverseString {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Koya");
        fruits.add("Banana");

//        fruits.remove("Banana");
//        fruits.set(3,"Harish");

        System.out.println("Before sorting: "+fruits);

        Collections.sort(fruits);

        System.out.println("After sorting: "+fruits);

        Collections.reverse(fruits);

        System.out.println("reverse sorting: "+fruits);


        //-------------------

        ArrayList<String> deptNames2 = new ArrayList<String>();
        deptNames2.add("B");
        deptNames2.add("D");
        deptNames2.add("A");
        deptNames2.add("C");

        System.out.println("Before Sorting in reverse: " + deptNames2);
        Collections.sort(deptNames2, Collections.reverseOrder());
        System.out.println("Reverse in reverse Order:" + deptNames2);



    }
}
