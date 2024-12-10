import java.util.*;

public class Euler_phi_better 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=n;
        for(int i=2;i<=Math.sqrt(n);++i)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    n/=i;
                }
                result-=result/i;
            }
        }
        if(n>1)
        {
            result-=result/n;
        }
        System.out.println(result);
        sc.close();
    }    
}
