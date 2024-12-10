import java.util.*;
public class Extended_GDC{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int[] xy = new int[2];
        
        int GCD = ExtendedGCD(a,b,xy);
        System.out.println("GCD Is => " + GCD);
        System.out.println("Coeff of X is => " + xy[0]);
        System.out.println("Coeff of Y is => " + xy[1]);
    }

    public static int ExtendedGCD(int a,int b,int[] xy) {
        if (b == 0) {
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        
        int[] Temp = new int[2];
        int GCD = ExtendedGCD(b,a % b, Temp);
        xy[0] = Temp[1];
        xy[1] = Temp[0] - (a/b) * Temp[1];
        return GCD;
        
    }
}