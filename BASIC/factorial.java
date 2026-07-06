package BASIC;

import java.util.*;
public class factorial {


     static int fac(int n){
                if(n==1 || n == 0){
                    return 1;
                }else if(n<0){
                    System.out.println("enter a postitive number");
                    return -1;
                } else{
                    return n*fac(n-1);
                }
            }

    public static void main(String[] args) {
        
           System.out.println("Enter any no.");
            Scanner hi = new Scanner(System.in);
            int b = hi.nextInt();

            System.out.println(fac(b));

hi.close();

    }
    
}
