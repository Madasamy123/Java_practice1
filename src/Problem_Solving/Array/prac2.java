package Problem_Solving.Array;
import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        int[] numbers=new int[5];
        Scanner input=new Scanner(System.in);
//        numbers[0]=input.nextInt();
//        numbers[1]=input.nextInt();
//        numbers[2]=input.nextInt();
//        numbers[3]=input.nextInt();
//        numbers[4]=input.nextInt();

        for(int i=0;i<5;i++){
            numbers[i]=input.nextInt();
        }

        int sum=0;

        for(int i=0;i< numbers.length;i++){
           sum+=numbers[i];
        }

        System.out.println("Sum of the Numbers: "+sum);


    }
}
