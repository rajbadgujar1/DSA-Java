package BITMANIPULATION;
import java.util.*;
public class updatebit {
    public static void main(String[] args) {
        
        Scanner hi = new Scanner(System.in);
         System.out.println("Enter a number in which you would like to change bit");
         int n = hi.nextInt();
       
        
        System.out.println("Enter the postion of bit where u want the change");
        int pos = hi.nextInt();
        if(pos<0){
            System.out.println("Enter a valid position");
            return;
        }

        System.out.println("Enter a bit you desire to insert");
        int a = hi.nextInt();
        
       
        int bitmask = 1<<pos;
        if(a == 0){

            int h = (~bitmask & n);
            System.out.println("the updated num is:" +h);

        }else if(a == 1){
            int h = bitmask | n;
            System.out.println("The updated num is:" +h);
        }else{
            System.out.println("enter a valid bit either 1 or 0");
        }
        hi.close();
        
    }
    
}
