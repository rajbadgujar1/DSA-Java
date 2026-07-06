package BASIC;
import java.util.*;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
            sc.close();
    }

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

         return gcd(b, a%b);
    }
}