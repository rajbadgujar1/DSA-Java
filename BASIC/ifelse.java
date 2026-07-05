package BASIC;
import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("enter ur age");
        int age = hi.nextInt();
        if (age>18) {
            System.out.println("Adult");
            
        } else {
            System.out.println("Not adult");
        }
         hi.close();
    }

   
    
}
