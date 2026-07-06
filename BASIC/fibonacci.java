package BASIC;
import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter any num");
        int a = hi.nextInt();
       System.out.println(fib(a));

        hi.close();

    }

    static int fib(int n){
        if (n <= 1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
        
    }
    
}
