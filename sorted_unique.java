import java.util.*;
public class sorted_unique {
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static int calculateTotal(char[] temp) {
        int f = factorial(temp.length);
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : temp) freq.put(c, freq.getOrDefault(c, 0) + 1);
        for (int x : freq.values()) if (x > 1) f /= factorial(x);
        return f;
    }

    static void nextPermutation(char[] temp) {
        int i = temp.length - 1;
        while (i > 0 && temp[i] <= temp[i - 1]) i--;
        if (i > 0) {
            int x = temp[i - 1], min = i;
            for (int j = i + 1; j < temp.length; j++)
                if (temp[j] > x && temp[j] < temp[min]) min = j;
            char t = temp[i - 1];
            temp[i - 1] = temp[min];
            temp[min] = t;
        }
        Arrays.sort(temp, i, temp.length);
        System.out.println(String.valueOf(temp));
    }

    static void printAllPermutations(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        System.out.println(String.valueOf(temp));
        int total = calculateTotal(temp);
        for (int i = 1; i < total; i++) nextPermutation(temp);
    }

    public static void main(String[] args) {
        String s = "aal";
        printAllPermutations(s);
    }
}