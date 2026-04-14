public class reversedigit {

    public static void main(String[] args) {

        int ans = 0;
        int n = 12345;

        while (n != 0) {

            int digit = n % 10;
            ans = ans * 10 + digit;

            n /= 10;
        }

        System.out.println(ans);
    }
}