package InterviewQuestions;


import java.util.Arrays;

public class anagram {
    public static void main(String [] args){

                String a="apple";
                String b="leppao";

                if(a.length()!=b.length()){
                    System.out.println("It is not anagram");
                    return;

                }

                char [] ch1=a.toCharArray();
                char [] ch2=b.toCharArray();



                Arrays.sort(ch1);
                Arrays.sort(ch2);

                if(Arrays.equals(ch1,ch2)){
                    System.out.println("It is anagram");

                }
                else{
                    System.out.print("It is not anagram");
                }

    }
}



//public class anagram {
//    public static void main(String [] args){
//
//        String a="apple";
//        String b="leppa";
//
//        boolean isTrue=true;
//
//        if(a.length()!=b.length()){
//            System.out.println("It is not anagram");
//           return;
//        }
//
//        for(int i=0;i<a.length();i++){
//            if(!b.contains(String.valueOf(a.charAt(i)))){
//                isTrue=false;
//                break;
//            }
//        }
//        if(isTrue){
//            System.out.println("It is an anagram");
//        }
//        else{
//            System.out.println("It is not anagram");
//        }
//
//    }
//}
