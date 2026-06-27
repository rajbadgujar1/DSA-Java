    import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("enter an input");
        int input = hi.nextInt();
        switch (input) {
            case 1:
                System.out.println("hello");
                break;
                case 2:
                    System.out.println("namaskar");
                    break;
                    case 3:
                        System.out.println("namaste");
                        break;
            default:
                System.out.println("Not today");
                
        }
        hi.close();;
    }
    
}
