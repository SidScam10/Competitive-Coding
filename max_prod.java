import java.util.*;
class prod_arr {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println(0);
            return;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int pre=1,suf=1,ans=1;
        for(int i=0;i<n;i++)
        {
            if(pre==0)  pre=1;
            if(suf==0)  suf=1;
            pre*=arr[i];
            suf*=arr[n-i-1];
            ans=Math.max(ans,Math.max(pre,suf));
        }
        System.out.println(ans);
    }
}