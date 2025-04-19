package Problem_Solving.ForLoop;
import java.util.Scanner;

public class practice4 {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a=input.nextInt();

        System.out.println("Enter your second number: ");
        int b=input.nextInt();
        int oddcount=0;
        int evencount=0;
        for(int i=a;i<=b;i++){

            if(i%2!=0){
                oddcount++;


            }
            else{
               evencount++;
            }

        }

        System.out.println("Total odd Numbers: "+oddcount);
        System.out.println("Total even Numbers: "+evencount);

    }
}
