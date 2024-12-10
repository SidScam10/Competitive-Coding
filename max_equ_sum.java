import java.util.*;

public class max_equ_sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] pre = new int[n];
        int[] suf = new int[n];
        int ans = Integer.MIN_VALUE;

        // Calculate prefix sum array
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }

        // Calculate suffix sum array
        suf[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + arr[i];
        }

        // Find the maximum sum where prefix and suffix sums are equal
        for (int i = 0; i < n; i++) {
            if (pre[i] == suf[i]) {
                ans=Math.max(ans,pre[i]);
            }
        }

        System.out.println(ans);
    }
}
