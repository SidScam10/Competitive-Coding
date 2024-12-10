import java.util.*;

public class Segmented_Sieve 
{  
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n_low=sc.nextInt();
        int n_high=sc.nextInt();
        ArrayList<Integer> primes=new ArrayList<Integer>();
        
        boolean[] bool=new boolean[(int)Math.sqrt(n_high)+1];
        Arrays.fill(bool, true);
        for (int i=2;i<=Math.sqrt(n_high);i++) 
        {
            if (bool[i]==true) 
            {
                primes.add(i);
                for (int j=i*i;j<=Math.sqrt(n_high);j+=i) 
                {
                    bool[j]=false;
                }
            }
        }
        
        boolean[] isPrimeRange=new boolean[n_high+1];
        Arrays.fill(isPrimeRange, true);
        
        for (int p : primes) 
        {
            // Calculate the starting point for marking multiples of p
            int start=(int)Math.ceil(2.0/p)*p;
            for (int j=start;j<=n_high;j+=p) 
            {
                isPrimeRange[j]=false;
            }
        }
        
        System.out.print("Prime numbers from " +n_low+" to "+n_high+": ");
        for (int i=Math.max(n_low,2);i<=n_high;i++) 
        {
            if (isPrimeRange[i]==true) 
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
