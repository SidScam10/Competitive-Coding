import java.util.Scanner;

public class RatMaze {
    static int N;

    void printSolution(int[][] sol) {
        for (int[] row : sol) {
            for (int cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }

    boolean isSafe(int[][] maze, int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1;
    }

    boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol) || solveMazeUtil(maze, x, y + 1, sol) || 
                solveMazeUtil(maze, x - 1, y, sol) || solveMazeUtil(maze, x, y - 1, sol)) 
                return true;
            sol[x][y] = 0;
        }
        return false;
    }

    boolean solveMaze(int[][] maze) {
        int[][] sol = new int[N][N];
        if (!solveMazeUtil(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[][] maze = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                maze[i][j] = sc.nextInt();
        new RatMaze().solveMaze(maze);
    }
}