// package math;
import java.util.Scanner;



public class m {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter integer");

       int  input=sc.nextInt();


        while (input!=0) { 

            int digit= input%10;

            System.out.println(digit);

            input/=10;

            System.out.println(input);


            
        }

        
        
    }
    
}
