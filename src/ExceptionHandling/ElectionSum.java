package ExceptionHandling;

import java.util.Scanner;

class person{

    String name;
    private int age;
    private double voterIdNO;

    public void setAge(int age) {
        this.age = age;
    }

    public  int  getAge (){
        return age;

    }

    public void setVoterIdNO(double voterIdNO){
        this.voterIdNO=voterIdNO;

    }
    public double getVoterIdNO(){
        return voterIdNO;
    }

    public  person(){

    }

    public person(String name,int age,double voterIdNo){
        this.age=age;
        this.name=name;
        this.voterIdNO=voterIdNO;

    }


    public void verification(int age)throws Exception{
        if(age<18){
            throw new Exception("Not eligible to vote");
        }
        else{
            System.out.println("Your eligible to vote");
        }
    }



}

public class ElectionSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            try{
                System.out.print("Enter your age: ");
                int age=sc.nextInt();
                person p=new person();
                p.verification(age);
            }
            catch(Exception e){
                System.out.println("Error message: " + e.getMessage());


            }

            finally{
                System.out.println("process completed");

            }
        }

    }

