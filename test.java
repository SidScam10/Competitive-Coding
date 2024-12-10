import java.util.*;
class test {
    static int gcd(int a, int b, int[] xy)
    {
        if(b==0)
        {
            xy[0]=1;
            xy[1]=0;
            return a;
        }
        int temp[]=new int[2];
        int GCD=gcd(b,a%b,temp);
        xy[0]=temp[1];
        xy[1]=temp[0]-(a/b)*temp[1];
        return GCD;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int xy[]=new int[2];
        int res=gcd(a,b,xy);
        System.out.println("GCD: "+res);
        System.out.println("Coeff of X: "+xy[0]);
        System.out.println("Coeff of Y: "+xy[1]);
    }
}