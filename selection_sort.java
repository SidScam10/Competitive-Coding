import java.util.*;
public class selection_sort {
    public static void main(String args[])
    {
        int nums[]={4,5,3,6,7};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
