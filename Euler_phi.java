import java.util.*;
public class Euler_phi {
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=1;
        for(int i=2;i<n;i++)
        {
            if(gcd(i,n)==1)
            {
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
