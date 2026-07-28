class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int nR = matrix.length, nC = matrix[0].length;

        int top = 0, bot = nR - 1;
        int row = -1;
        while (top <= bot)
        {
            int m = top + ((bot - top)/ 2);

            if (matrix[m][0] <= target && matrix[m][nC-1] >= target)
            {
                row = m;
                break;
            }
            else if (matrix[m][0] > target)
            {
                bot = m - 1;
            }
            else
            {
                top = m + 1;
            }
        }
        
        if (row == -1)
        {
            return false;
        }
        
        int l = 0, r = nC - 1;

            while (l <= r)
            {
                int mid = l + ((r - l) / 2);

                if (matrix[row][mid] == target)
                {
                    return true;
                }
                else if (matrix[row][mid] > target)
                {
                    r = mid - 1;
                }
                else
                {
                    l = mid + 1;
                }
            }

        return false;
    }
}
