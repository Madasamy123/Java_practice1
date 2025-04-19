package InterviewPractice;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer>num=new Stack<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        for(int result:num){
            System.out.println(result);
        }


    }
}
