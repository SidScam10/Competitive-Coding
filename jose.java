import java.util.*;
public class jose {
    static int josephus(int n,int k)
    {
        return (n==1) ? 1 : (josephus(n-1,k)+k-1)%n+1;
    }
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        System.out.println(josephus(n,k));
    }
}
