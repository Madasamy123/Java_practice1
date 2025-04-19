package Collections.ArrayList.practice;

import java.util.*;
class stack {
    public static void main(String[] args) {

        Stack<Integer>numbers=new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);

        numbers.pop();

        numbers.push(7);



        // System.out.print("peek: "+numbers.peek());

        //  System.out.print("empty: "+numbers.empty());

        System.out.print("search: "+numbers.search(3));
    }
}
