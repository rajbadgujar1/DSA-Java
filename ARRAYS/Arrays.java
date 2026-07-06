package ARRAYS;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Enter length of the array");
        Scanner hi = new Scanner(System.in);
        int a = hi.nextInt();
        int [] marks = new int[a];

        for(int i = 0;i<a;i++){
              System.out.println("Enter element no."+i+"in the array");
            marks[i] = hi.nextInt();
        }

            System.out.println("enter a number to find");
            int b = hi.nextInt();




        for(int i = 0;i<a;i++){
            if(marks[i]== b){
                System.out.println("The indexing of the entered number is:-");
                System.out.println(i);
            }
        }
            hi.close();


    }
    
}
