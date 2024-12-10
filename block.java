import java.util.*;
public class block {
    public static void rotate(int[] arr, int d)
    {
        int n=arr.length;
        d=d%n;
        if(d==0) return;
        swap(arr,0,d-1);
        swap(arr,d,n-1);
        swap(arr,0,n-1);
    }
    public static void swap(int[]  arr, int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //Size of array
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); //Array elements
        }
        int rotations=sc.nextInt(); //No of rotations
        rotate(arr,rotations);
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }
}
