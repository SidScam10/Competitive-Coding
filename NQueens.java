import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                board[i][j] = '-';
        if (solve(board, 0, n)) 
            print(board, n);
        else 
            System.out.println("No solution");
    }

    public static void print(char[][] board, int n) {
        for (int i = 0; i < n; i++, System.out.println()) 
            for (int j = 0; j < n; j++) 
                System.out.print(board[i][j] + " ");
    }

    public static boolean safe(char[][] board, int r, int c, int n) {
        for (int i = 0; i < c; i++) if (board[r][i] == 'Q') return false;
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) if (board[i][j] == 'Q') return false;
        for (int i = r, j = c; i < n && j >= 0; i++, j--) if (board[i][j] == 'Q') return false;
        return true;
    }

    public static boolean solve(char[][] board, int c, int n) {
        if (c >= n) return true;
        for (int i = 0; i < n; i++) {
            if (safe(board, i, c, n)) {
                board[i][c] = 'Q';
                if (solve(board, c + 1, n)) return true;
                board[i][c] = '-';
            }
        }
        return false;
    }
}