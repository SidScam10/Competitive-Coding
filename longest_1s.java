import java.util.*;
public class longest_1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] bin_str = sc.nextLine().split(" ");
        int[] a = new int[bin_str.length];
        
        for (int i = 0; i < bin_str.length; i++) {
            a[i] = Integer.parseInt(bin_str[i]);
        }
        int k = sc.nextInt();
        
        int ones = 0, replace_count = 0, l = 0;

        for (int r = 0; r < a.length; r++) {
            if (a[r] == 0) {
                replace_count++;
            }

            while (replace_count > k) {
                if (a[l] == 0) {
                    replace_count--;
                }
                l++;
            }

            ones = Math.max(ones, r - l + 1);
        }

        System.out.println("Length of longest contiguous subarray of 1s after replacement = " + ones);
    }
}
