package ExceptionHandling;

public class TryCatchExample {

    public static void main(String []args){

        int a=10;
        int b=0;
        try{
            int c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide the zero value "+e);
        }


        System.out.println("completed program");
    }
}
