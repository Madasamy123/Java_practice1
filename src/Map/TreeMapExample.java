package Map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {

        public static void main(String[] args) {
            TreeMap<Integer, String> ma = new TreeMap<>();
            ma.put(3, "Apple");
            ma.put(1, "Banana");
            ma.put(2, "Cherry");

            System.out.println(ma);  // Keys are sorted in ascending order
        }
    }

