public class homework {

    static void printWelcomeMessage() {
        System.out.println("Welcome!");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static int getMaximum(int a, int b) {
        return (a > b) ? a : b;
    }

    static double calculatePercentage(int obtained, int total) {
        return (obtained * 100.0) / total;
    }

    static void display(int num) {
        System.out.println("Number: " + num);
    }

    static void display(String text) {
        System.out.println("Text: " + text);
    }

    static void updateValue(int x) {
        x = x + 10;
        System.out.println("Inside: " + x);
    }

    public static void main(String[] args) {
        printWelcomeMessage();
        System.out.println(add(10, 20));
        System.out.println(isEven(4));
        System.out.println(getMaximum(10, 50));
        System.out.println(calculatePercentage(450, 500));
        display(100);
        display("Hello");

        int a = 5;
        updateValue(a);
        System.out.println("Outside: " + a);
    }
}