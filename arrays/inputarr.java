import java.util.Scanner;

public class inputarr {

    // factorial function
    static int factorial(int num){
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        int n = arr.length;

        Scanner sc = new Scanner(System.in);

        // input
        for(int i = 0; i < n; i++){
            System.out.println("enter a number");
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // factorial + print
        for(int val : arr){
            System.out.println("Number: " + val);

            int fact = factorial(val);
            System.out.println("Factorial: " + fact);

            sum += val;
        }

        System.out.println("Sum = " + sum);
    }
}
