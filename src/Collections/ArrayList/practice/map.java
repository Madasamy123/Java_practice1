package Collections.ArrayList.practice;
import java.util.*;


class map {
    public static void main(String[] args) {

        Map<String,Integer>Employee=new HashMap<String,Integer>();
        Employee.put("Madasamy",1);
        Employee.put("sudharsan",2);
        Employee.put("senthil",3);
        Employee.put("bala",4);
        Employee.put("pugal",5);

//        System.out.println(Employee.get("Madasamy"));
//        System.out.println(Employee.keySet());
//        System.out.print(Employee.values());

//        System.out.print(Employee.entrySet());
//        Employee.remove("bala",4);
          Employee.put("bala",8);

        System.out.println(Employee);


//        System.out.print(Employee);
    }
}