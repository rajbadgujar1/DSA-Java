

public class pratice {
    /*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
    
    */
    public static void main(String[] args) {
         int n = 5;
         for(int i = 1;i<=5;i++){
            int spaces = 2*(n-i);
            for(int j = 1;j<=i;j++){
                System.out.print("*");

            }
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
             for(int j = 1;j<=i;j++){
                System.out.print("*");

            } 
            System.out.println();
               }

               for(int i = 1; i<=n;i++){
                for(int j = 1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                int spaces = 2*(4+i-n);
                for(int j = 1;j<=spaces;j++){
                    System.out.print(" ");
                }
                 for(int j = 1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
               }


    }
}