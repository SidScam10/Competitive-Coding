import java.util.*;
public class nibble {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int swap=((n & 0x0F) << 4 | (n & 0xF0) >> 4);
        System.out.println(swap);
    }
}