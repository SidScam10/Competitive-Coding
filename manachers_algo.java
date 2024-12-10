import java.util.*;
class manachers_algo {
    public static void main(String args[])
    {
        String str="abba";
        int len=0;
        HashSet<Character> set=new HashSet<>();
        for(char ch:str.toCharArray())
        {
            if(set.contains(ch))
            {
                set.remove(ch);
                len+=2;
            }
            else set.add(ch);
        }
        if(!set.isEmpty()) len+=1;

        System.out.println(len);
    }
}


/*
 * public class Main {

    int manachersAlgorithm(String s, int N) {
        // Get the modified string
        String str = getModifiedString(s, N);
        int len = (2 * N) + 1;
        int[] P = new int[len];
        int c = 0; // Center of the current longest palindromic substring
        int r = 0; // Right boundary of the current longest palindromic substring
        int maxLen = 0;

        for (int i = 0; i < len; i++) {
            // Get the mirror index of i
            int mirror = (2 * c) - i;

            // If within bounds, use the minimum of the mirrored length or remaining length
            if (i < r) {
                P[i] = Math.min(r - i, P[mirror]);
            }

            // Expand around the center
            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while (a < len && b >= 0 && str.charAt(a) == str.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }

            // Update center and right boundary if a longer palindrome is found
            if (i + P[i] > r) {
                c = i;
                r = i + P[i];
                if (P[i] > maxLen) { // Update maximum length
                    maxLen = P[i];
                }
            }
        }
        return maxLen;
    }

    String getModifiedString(String s, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#");
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "inputstring";
        Main obj = new Main();
        System.out.println(obj.manachersAlgorithm(str, str.length()));
    }
}

 */