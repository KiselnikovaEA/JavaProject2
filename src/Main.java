import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                new int[]{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                new int[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        for(int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
        int maxIsland = Solution.maxAreaOfIsland(grid);
        System.out.println(maxIsland);
        System.out.println();
// -------------------------------------------------------------------------

        int[][] col = new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 1, 0},
                new int[]{1, 0, 1}
                };
        for(int i = 0; i < col.length; i++) {
            System.out.println(Arrays.toString(col[i]));
        }
        System.out.println();
        col = Solution2.floodFill(col, 1, 1, 2);
        for(int i = 0; i < col.length; i++) {
            System.out.println(Arrays.toString(col[i]));
        }
        System.out.println();

    }
}
