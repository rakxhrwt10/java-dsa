



public class rombus {

    public static void main(String[] args) {
        

        int n=10;

        for(int row=1;row<=n;row++){


            for(int space=n-row;space>=1;space--){
                System.err.print(" ");


            }
            for(int col=1;col<=n;col++){
                System.err.print("*");

            }

            System.err.println();

        }
    }


    
}
