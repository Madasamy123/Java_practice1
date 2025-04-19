package Map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String [] args){
        HashMap<String,Integer>StudentsList=new HashMap<>();
        StudentsList.put("Maddy",1);
        StudentsList.put("Sudharsan",2);
        StudentsList.put("Bala",3);
        StudentsList.put("Senthil",4);

        System.out.println(StudentsList);
    }
}
