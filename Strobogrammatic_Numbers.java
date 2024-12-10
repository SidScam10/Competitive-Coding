import java.util.*;

public class Strobogrammatic_Numbers{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String num_str=sc.nextLine();
        String str="";
        int flag=0;
        HashMap<Character,Character> nums=new HashMap<>();
        nums.put('0','0');
        nums.put('1','1');
        nums.put('8','8');
        nums.put('6','9');
        nums.put('9','6');
        for(int i=num_str.length()-1;i>=0;i--)
        {
            char ch=num_str.charAt(i);
            if(!nums.containsKey(ch))
            {
                flag=1;
                break;
            }
            str+=nums.get(ch);
        }
        if(flag==0 && str.equals(num_str))
        {
            System.out.println(num_str+" is Strobogrammatic");
        }
        else
        {
            System.out.println(num_str+" is not Strobogrammatic");
        }
        sc.close();
    }
}