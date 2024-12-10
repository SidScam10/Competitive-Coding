import java.util.*;
public class Simple_Sieve {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int k=sc.nextInt();
        //int count=0;
        boolean[] bool=new boolean[n];
        for(int i=0;i<n;i++)
        {
            bool[i]=true;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(bool[i]==true)
            {
                for(int j=i*i;j<n;j=j+i)
                {
                    bool[j]=false;
                }
            }
        }
        for(int i=5;i<bool.length;i++)
        {
            if(bool[i]==true && bool[i-2]==true)
            {
                //count++;
                System.out.println(i-2+" "+i);
            }
            /*if(count==k)
            {
                System.out.println(": "+ i);
                break;
            }*/
        }
        sc.close();
    }
}
