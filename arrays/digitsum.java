public class digitsum {

    public static void main(String[] args) {

        int num = 1234;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;  // last digit
            sum += digit;          // add
            num = num / 10;        // remove last digit
        }

        System.out.println("Digit Sum = " + sum);
    }
}