
public class jackedarr {


    public static void main(String[] args) {
        

        int brr[][]={
        {1,2},
        {3,4,5,6,7},
        {8,9},
        {10},{15,16}

        };

        int rowlenth=brr.length;
        // int collength=brr[1].length;

        System.out.println(rowlenth);
        // System.out.println(collength);



        for (int rowIndex = 0; rowIndex < rowlenth; rowIndex++) {


            int collength=brr[rowIndex].length;

            for (int colIndex = 0; colIndex < collength; colIndex++) {

                System.out.print(brr[rowIndex][colIndex]+" ");
                
            }
            System.out.println();
            
        }





       


       
    }
    
}
