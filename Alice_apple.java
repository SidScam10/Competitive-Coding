import java.util.*;
public class Alice_apple {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int K=sc.nextInt();
        int N=sc.nextInt();
        int S=sc.nextInt();
        int W=sc.nextInt();
        int E=sc.nextInt();
        if(M<=S*K)
        {
            System.out.println(M);
        }
        else if(M<=S*K+E+W)
        {
            System.out.println(S*K+(M-S*K));
        }
        else
        {
            System.out.println(-1);
        }
        sc.close();
    }
}
