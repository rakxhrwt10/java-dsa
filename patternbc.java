//  git add .
//  git commit -m "new update"
// git push 
// git remote add origin 
public class patternbc {

  public static void main(String[] args) {

    int n=5;
    int count=1;
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n;j++){
    //     if(j==3 ||i==1 || i==3){
    //       break;
    //     }
    //     else{
    //       System.out.print("*");
    //     }
    //   }
    //   count++;
    //   System.out.println();
    // }


    outer: for(int i = 1; i<= 10; i++) {
           inner: for(int j = 1; j <= i; j++) {
                System.out.print("* ");

                if(j >= 5) {
                    continue outer;
                }
           }
           System.out.println();

           

  }
  }
}
