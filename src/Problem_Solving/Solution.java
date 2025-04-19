package Problem_Solving;

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner A=new Scanner(System.in);
        String first=A.nextLine();
        String newStr="";

        for(int i=first.length()-1;i>=0;i--){
            newStr+=first.charAt(i);


        }
        if(first.equals(newStr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}