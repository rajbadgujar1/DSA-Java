package ARRAYS;
import java.util.*;

public class array2d {

    public static void main(String[] args) {
        
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = hi.nextInt();
        System.out.println("Enter no. of columns");
        int m = hi.nextInt();
        int matrix[][] = new int[n][m];

        for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    System.out.println("Enter a number for indexing" + i +" " + j);

                        matrix[i][j] = hi.nextInt();
                }
            }

            System.out.println("Enter a number for its index to be found");
            int h = hi.nextInt();
            
        for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                  if(matrix[i][j]==h){
                    System.out.println(i+ " " +j);
                  }

                }
       
            }

                hi.close();
    }
    
}
