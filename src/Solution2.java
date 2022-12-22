public class Solution2 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, color, oldColor);
        return image;
    }

    private static void dfs(int[][] image, int i, int j, int color, int oldColor) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length
                || image[i][j] != oldColor || image[i][j] == color) {
            return;
        }
        image[i][j] = color;
        dfs(image, i - 1, j, color, oldColor);
        dfs(image, i + 1, j, color, oldColor);
        dfs(image, i, j - 1, color, oldColor);
        dfs(image, i, j + 1, color, oldColor);
    }
}