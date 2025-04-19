package InterviewQuestions;

public class lcm {
    public static void main(String [] args){
        int a=10;
        int b=35;


        int c=a*b;

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }




        int result=c/a;

        System.out.println(result);





    }
}
