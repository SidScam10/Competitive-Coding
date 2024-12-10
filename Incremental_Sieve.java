import java.util.*;
public class Incremental_Sieve 
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> primes=new ArrayList<>();
        ArrayList<Integer> odd_composites=new ArrayList<>();
        primes.add(2);
        int next_num=3;
        while(next_num<=n)
        {
            boolean bool=true;
            for(int prime:primes)
            {
                if(prime>Math.sqrt(next_num))
                {
                    break;
                }
                if(next_num%prime==0)
                {
                    bool=false;
                    break;
                }
            }
            if(bool==true)
            {
                primes.add(next_num);
                for(int i=next_num*next_num;i<n+1;i+=2*next_num)
                {
                    odd_composites.add(i);
                }
            }
            next_num+=2;
        }
        System.out.println(primes);
        System.out.println(odd_composites);
        sc.close();
    }
}