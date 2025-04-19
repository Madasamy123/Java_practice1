package LambdaExpression;


interface ArithimaticOperations{
    int operations(int a,int b);
}

public class LambdaPractice {
    public static void main(String[] args) {
        ArithimaticOperations add=(a,b)->a+b;
        System.out.println("Addition: "+add.operations(5,6));

        ArithimaticOperations sub=(a,b)->a-b;
        System.out.println("Substraction: "+sub.operations(5,6));


        ArithimaticOperations mul=(a,b)->a*b;
        System.out.println("Multiplication: "+mul.operations(5,6));


        ArithimaticOperations div=(a,b)->b/a;
        System.out.println("Division: "+div.operations(5,6));
    }
}
