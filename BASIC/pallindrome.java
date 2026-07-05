package BASIC;
import java.util.*;

public class pallindrome {
    public static void main(String[] args) {
      
        Scanner hi = new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String ok = hi.next();
        int i = 0;
        int e = ok.length() - 1;
        while(e>i){
            if (ok.charAt(i)!=ok.charAt(e)) {
                System.out.println("This is not a pallindrome gng");
                
            } else {
                System.out.println("This is a pallindrome gng");
                
            }
            i++;
            e--;
        }
            hi.close();

    }
}