class Solution {
    int[][] image;
    int val, old;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.image = image;
        val = newColor;
        old = image[sr][sc];
        if (old != val)
            fill(sr, sc);
        return image;
    }

    void fill(int i, int j) {
        if (i < 0 || i == image.length || j < 0 || j == image[0].length || image[i][j] != old)
            return;
        image[i][j] = val;
        fill(i + 1, j);
        fill(i - 1, j);
        fill(i, j - 1);
        fill(i, j + 1);
    }
}