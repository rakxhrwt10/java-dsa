import java.util.Scanner;

public class countdigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer");

        int input = sc.nextInt();

        int count = 0;

        while (input != 0) {

            int digit = input % 10;
            count++;

            System.out.println(digit);

            input /= 10;
        }

        System.out.println("Total digits: " + count);
    }
}