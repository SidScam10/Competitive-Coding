import java.util.*;
class hourglass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        if(row<3 || col<3)
        {
            System.out.println("Invalid");
            return;
        }
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0,max_sum=0;
        for(int i=0;i<row-2;i++)
        {
            for(int j=0;j<col-2;j++)
            {
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                max_sum=Math.max(max_sum,sum);
            }
        }
        System.out.println(max_sum);
    }
}
