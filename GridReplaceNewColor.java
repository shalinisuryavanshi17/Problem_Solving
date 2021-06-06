
/*
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and newColor. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with newColor.

Return the modified image after performing the flood fill.

Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, newColor = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
Example 2:

Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, newColor = 2
Output: [[2,2,2],[2,2,2]]


Note :
Use Arrays.deepToString(array) to print 2D array

Constraints:

m == image.length
n == image[i].length
1 <= m, n <= 50
0 <= image[i][j], newColor < 216
0 <= sr <= m
0 <= sc <= n
 */
import java.util.*;

class GridReplaceNewColor {
    public static void replaceNewColors(int grid[][], int i, int j, int newColor, int oldColor) {
        System.out.println("grid length is "+grid.length);
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != oldColor) {
            return;
        }
        grid[i][j] = newColor;
        replaceNewColors(grid, i + 1, j, newColor, oldColor);
        replaceNewColors(grid, i - 1, j, newColor, oldColor);
        replaceNewColors(grid, i, j + 1, newColor, oldColor);
        replaceNewColors(grid, i, j - 1, newColor, oldColor);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int grid[][] = new int[rows][cols];
        // int i, j;
        // for (i = 0; i < grid.length; i++) {
        //     for (j = 0; j < grid[i].length; j++) {
        //         grid[i][j] = sc.nextInt();
        //     }
        // }
        // int sr = sc.nextInt();
        // int se = sc.nextInt();
        // int newColor = sc.nextInt();
        int grid[][]={{1,1,1},{1,1,0},{1,0,1}};
        replaceNewColors(grid, 1, 1, 2, grid[1][1]);
        System.out.println(Arrays.deepToString(grid));
    }

}
