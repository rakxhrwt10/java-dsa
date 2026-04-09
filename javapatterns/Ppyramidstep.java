

public class Ppyramidstep {

    public static void main(String[] args) {
        

        int step=1;

        int n=5;

        for(int row=1;row<=5;row++){


            for(int space=n-row;space>=1;space--){

                System.out.print(" ");
            }

            for(int col=1;col<=2*row-1;col++){

               

                System.out.print("*");
                
            }
            
            

            System.out.println();

        }
    }
    
}
