package LambdaExpression;




//interface ArithameticOperations{
//
//    int add(int a, int b);
//
//}
//
//public class LambdaDemo {
//
//    public static void main(String[] args) {
//        ArithameticOperations first=new ArithameticOperations() {
//
//            public int add(int a, int b){
//                return a+b;
//            }
//
//        };
//        int result= first.add(5,6);
//        System.out.println(result);
//    }
//
//}


//  ----------------------------------


interface MotorDetails {

   int addElement(int a, int b);

}

public class LambdaDemo {

    public static void main(String[] args) {
        MotorDetails obj = (a,b)->a+b;



            int result=obj.addElement(5,6);
            System.out.println(result);



    }


}




