package InterviewQuestions;

public class fibinossi {

     static void fibbi(int n){

        int first=0;
        int second=1;


        for(int i=0;i<n;i++){
            System.out.println(first+" ");
            int temp=first+second;//1
            first=second;//1
            second=temp;//1

        }



    }
    public static void main(String [] args){

        fibbi(5);
    }
}
