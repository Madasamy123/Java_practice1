// ✅ 4. List – Find the second highest number in a list

package LastPractice;
import java.util.*;

public class secondHighest {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        Set<Integer>unique=new TreeSet<>(nums);

        List<Integer>result=new ArrayList<>(unique);

        System.out.println(result.get(result.size()-2));



    }
}
