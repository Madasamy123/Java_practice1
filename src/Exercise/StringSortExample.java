package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortExample {
    public static void main(String[] args) {

        List<String>cityNames=new ArrayList<>();
        cityNames.add("TamilNadu");
        cityNames.add("Pune");
        cityNames.add("Haryana");
        cityNames.add("Andra");
        cityNames.add("Kerala");

//        System.out.println(cityNames);
        Collections.sort(cityNames);

        System.out.println(cityNames);



    }
}
