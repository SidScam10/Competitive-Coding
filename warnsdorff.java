import java.util.Scanner;

public class warnsdorff {
    private static final int[] ROW_MOVES = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int[] COL_MOVES = {1, 2, 2, 1, -1, -2, -2, -1};

    public static boolean isSafe(int[][] board, int row, int col, int N) {
        return row >= 0 && row < N && col >= 0 && col < N && board[row][col] == -1;
    }

    public static void printSolution(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static boolean solveKnightTour(int N) {
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }
        board[0][0] = 0;
        if (solveUtil(board, 0, 0, 1, N)) {
            printSolution(board);
            return true;
        }
        System.out.println("No solution exists.");
        return false;
    }

    public static boolean solveUtil(int[][] board, int row, int col, int moveCount, int N) {
        if (moveCount == N * N) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            int nextRow = row + ROW_MOVES[i];
            int nextCol = col + COL_MOVES[i];
            if (isSafe(board, nextRow, nextCol, N)) {
                board[nextRow][nextCol] = moveCount;
                if (solveUtil(board, nextRow, nextCol, moveCount + 1, N)) {
                    return true;
                }
                board[nextRow][nextCol] = -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the board size (N): ");
        int N = scanner.nextInt();
        solveKnightTour(N);
    }
}