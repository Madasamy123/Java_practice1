package InterviewQuestions;

public class panagram {
    public static void main(String [] args){

        String letters="The quick brown fox jumps over the lazy dog";
        String check="abcdefghijklmnopqrstuvwxyz";

        boolean isTrue=true;

        for(int i=0;i<check.length();i++){
           if(!letters.contains(String.valueOf(check.charAt(i)))){
               isTrue=false;
               break;
           }

        }
        if(isTrue){
            System.out.println("It is panagram");
        }
        else{
            System.out.println("It is not panagram");
        }

    }


}
