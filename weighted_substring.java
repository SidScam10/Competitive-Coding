import java.util.*;
class weighted_substring {
    public static void main(String args[])
    {
        HashSet<String> set=new HashSet<>();
        String str="abcde";
        //String q="12345678912345678912345678";
        int k=5;
        for(int i=0;i<str.length();i++)
        {
            int sum=0;
            String s="";
            for(int j=i;j<str.length();j++)
            {
                char ch=str.charAt(j);
                int curr=ch-'a'+1;
                //int pos=str.charAt(j)-'a';
                //int curr=q.charAt(pos)-'0';
                sum+=curr;
                s+=ch;
                if(sum==k) set.add(s); //if(sum<=k) set.add(s);
                else if(sum>k) break;
            }
        }
        System.out.println(set.size());
    }
}