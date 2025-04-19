package InterviewQuestions;

public class reverseStr {
    public static void main(String []args){
        String str="madasamy";

        StringBuilder result=new StringBuilder(str);

        System.out.print(result.reverse());
    }
}

//public class prac1 {
//    public static void main(String []args){
//        String str="madasamy";
//
//        String newStr="";
//
//        for(int i=str.length()-1;i>=0;i--){
//            newStr+=str.charAt(i);
//
//        }
//
//        System.out.print(newStr);
//
//    }
//}