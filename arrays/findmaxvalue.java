public class findmaxvalue {


    public static void main(String[] args) {
        



        int max=Integer.MIN_VALUE;

        int arr[]={10,400000000,5000,4000,1000000};


        int n=arr.length;


        for(int i=0;i<n;i++){


            if (arr[i]>max){


                max=arr[i];
            }





            
        }



        System.out.println(max);
    }
    
}
