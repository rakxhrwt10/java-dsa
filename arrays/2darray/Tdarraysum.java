

public class Tdarraysum {


    public static void main(String[] args) {
        


        int brr[][]={
        {1,1},
        {1,1,1,1,1},
        {1,1},
        {1},{1,1}

        };

        int rowlenth=brr.length;
        // int collength=brr[1].length;

        System.out.println(rowlenth);
        // System.out.println(collength);

        int sum=0;



        for (int rowIndex = 0; rowIndex < rowlenth; rowIndex++) {


            int collength=brr[rowIndex].length;

            for (int colIndex = 0; colIndex < collength; colIndex++) {

                System.out.print(brr[rowIndex][colIndex]+" ");
                sum+=brr[rowIndex][colIndex];
                
            }
            System.out.println();
            
        }


        System.out.println(sum);



    }
    
}
