class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int nR = matrix.length, nC = matrix[0].length;

        for (int i = 0; i < nR; i++)
        {
            int l = 0, r = nC - 1;

            while (l <= r)
            {
                int mid = l + ((r - l) / 2);

                if (matrix[i][mid] == target)
                {
                    return true;
                }
                else if (matrix[i][mid] > target)
                {
                    r = mid - 1;
                }
                else
                {
                    l = mid + 1;
                }
            }
        }
        
        return false;
    }
}
