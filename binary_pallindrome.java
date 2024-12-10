import java.util.*;
class binary_palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0,pal_count=0;
        for(int k=1;k<Math.pow(2,31)-1;k++)
        {
            String str=Integer.toBinaryString(k);
            int i=0,j=str.length()-1;
            while(i<j)
            {
                if(str.charAt(i)!=str.charAt(j))
                {
                    flag=1;
                    break;
                }
                i++;
                j--;
            }
            if(flag==0)
            {
                pal_count++;
            }
            if(pal_count==n)
            {
                System.out.println(n + "th Number whose binary representation is palindrome is " + k + " (" + str + ")");
                break;
            }
            flag=0;
        }
        sc.close();
    }
    
}