package comparable;

import java.util.ArrayList;
import java.util.Collections;

class Account implements Comparable<Account>{
    private String accNo;
    private String name;
    private double balance;


    public Account(String accNo,String name,double balance){
        this.accNo=accNo;
        this.balance=balance;
        this.name=name;
    }

    public void setAccNo(String accNo){
        this.accNo=accNo;
    }
    public String getAccNo(){
        return accNo;
    }
    public String getName(){
        return accNo;
    }

    public void setName(String name){
        this.name=name;
    }




    public void setBalance(double balance){
        this.accNo=accNo;
    }
    public double getBalance(){
        return balance;
    }

    public int compareTo(Account o) {
        if (balance == o.getBalance()) {
            return 0;
        } else {
            if (balance > o.getBalance()) {
                return 1;
            } else {
                return -1;
            }
        }

    }

    public String toString(){
        return "Account[ accNo: "+accNo+", name: "+name+", balance: "+balance+"]";
    }


}



 class comparableExample {
     public static void main(String[] args) {
         Account acct1=new Account("123","maddy",20000);
         Account acct2=new Account("456","sudharsan",30000);
         Account acct3=new Account("789","bala",15000);

         ArrayList<Account> nameList=new ArrayList<Account>();
         nameList.add(acct1);
         nameList.add(acct2);
         nameList.add(acct3);

         Collections.sort(nameList);

         System.out.println("List: "+nameList);
     }

}
