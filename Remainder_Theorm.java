import java.util.*;

public class Remainder_Theorm {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int result=1;
        int n=sc.nextInt();
        int[] quo=new int[n];
        int[] rem=new int[n];
        for(int i=0;i<n;i++)
        {
            quo[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            rem[i]=sc.nextInt();
        }
        sc.close();
        while(true)
        {
            int j;
            for(j=0;j<n;j++)
            {
                if(result%quo[j]!=rem[j])
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.println(result);
                break;
            }
            result++;
        }
    }
}
