import java.util.Scanner;

public class user {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        System.out.println("Enter a string:");
        String val = str.next();
        System.out.println("Provided value --> " + val);

        str.nextLine(); // buffer clear 🔥

        System.out.println("Enter full line:");
        String newval = str.nextLine();
        System.out.println("Provided new value --> " + newval);

        str.close();
    }
}



// import java.util.Scanner;

// public class user {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a string:");

//         String val = sc.next();   // ek word lega

//         System.out.println("Provided value --> " + val);

//         sc.close();
//     }
// }