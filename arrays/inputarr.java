
import java.util.Scanner;
public class inputarr {


    public static void main(String[] args) {
        

        int arr[]=new int[5];
        int n=arr.length;
        //input 
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<=n-1;i++){

           System.out.println("enter a number");
            arr[i]=sc.nextInt();
        }
         

        int sum=0;

        for(int val :arr){

            System.out.println(val);


            sum+=val;
        }

        System.out.println(sum);

    }
    
}
