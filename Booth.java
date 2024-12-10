import java.util.*;
public class Booth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integer numbers -");
        String binary1 = scan.next();
        String binary2 = scan.next();
        
        // Convert binary strings to integers
        int n1 = Integer.parseInt(binary1, 2);
        int n2 = Integer.parseInt(binary2, 2);

        int m = n1;
        int r = n2;
        int A = n1;
        int S = -n1;
        int res = 0;
        int count = Integer.SIZE;
        while (count > 0) {
            if ((r & 1) == 1) {
                res+=A;
                S+=m;
            }
            A <<= 1;
            S <<= 1;
            count --;
            r >>=1;
        }
        System.out.println("\n\nResult : " + n1 +" * " + n2 +" = "+ res);
    }
}