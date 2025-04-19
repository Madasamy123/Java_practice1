package InterviewQuestions;

public class factorial {
    public static void main(String [] args){

        int n=5;
        int mul=1;
        int sum=0;

        for(int i=1;i<=n;i++){
            mul*=i;
            sum+=mul;

        }

        System.out.print(sum);

    }
}
