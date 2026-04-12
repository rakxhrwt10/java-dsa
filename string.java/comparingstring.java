public class comparingstring {

    public static void main(String[] args) {

        String name = "Data";
        String name1 = "DatA";

        // 1. Using ==
        if (name == name1) {
            System.out.println("== : both string are equal");
        } else {
            System.out.println("== : not equal");
        }

        // 2. Using equals()
        if (name.equals(name1)) {
            System.out.println("equals(): both string are equal");
        } else {
            System.out.println("equals(): not equal");
        }

        // 3. Using equalsIgnoreCase()
        if (name.equalsIgnoreCase(name1)) {
            System.out.println("equalsIgnoreCase(): both string are equal");
        } else {
            System.out.println("equalsIgnoreCase(): not equal");
        }
    }
}