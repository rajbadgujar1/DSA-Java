package BITMANIPULATION;
// BITMASK , AND
// BITMASK = 1<< POS
public class getbit {
    public static void main(String[] args) {
        int n = 20;
        int pos = 4;
        int bitmask = 1<< pos;
        if((bitmask & n)== 0){
            System.out.println("Number at that position is 0");
        }else{
             System.out.println("Number at that position is 1");
        }
    }
    
}
