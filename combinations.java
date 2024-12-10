import java.util.Scanner;

class combinations {
    static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++) System.out.print(data[j] + " ");
            System.out.println();
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    static void printCombination(int[] arr, int n, int r) {
        combinationUtil(arr, new int[r], 0, n - 1, 0, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter value of r:");
        int r = sc.nextInt();
        printCombination(arr, n, r);
    }
}