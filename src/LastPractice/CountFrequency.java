package LastPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//   3. Map – Count frequency of characters in a string
public class CountFrequency {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character,Integer>map=new HashMap<>();

        for(char letters:str.toCharArray()){
            map.put(letters,map.getOrDefault(letters,0)+1);

        }

        System.out.println(map);
    }
}
