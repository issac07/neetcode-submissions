public class Solution {

    int[][] directions = new int[][]
    {
        new int[] {1, 0}, new int[] {0, 1}, 
        new int[] {-1, 0}, new int[] {0, -1}
    };
    
    public int MaxAreaOfIsland(int[][] grid) 
    {
        int max = 0;
        int rows = grid.Length;
        int cols = grid[0].Length;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (grid[i][j] == 1)
                {
                    max = Math.Max(max, DFS(grid, i, j));
                }
            }
        }

        return max;
    }

    public int DFS(int[][] grid, int row, int col)
    {
        if (row < 0 || col < 0 || row >= grid.Length ||
         col >= grid[0].Length || grid[row][col] == 0)
        {
           return 0;
        }
        grid[row][col] = 0;
        int c = 1;

        foreach (int[] dir in directions)
        {
           c = c + DFS(grid, row + dir[0], col + dir[1]);
        }

        return c;
    }
}
