package LambdaExpression.StreamAPI;

interface Students{
    int add(int a, int b);
}

public class PracStream {
    public static void main(String[] args) {

        Students op=(a,b)->(a+b);
        System.out.println(op.add(4,5));
    }
}
