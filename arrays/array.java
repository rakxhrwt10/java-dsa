

public class array {

    public static void main(String[] args) {

        // declaration
        int arrr[];
        int[] arr;

        // allocation
        arr = new int[3];   // ✅ correct variable

        // values assign kar dete hain
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;


        int newarr[]={500,400,600,900};

        // print
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
