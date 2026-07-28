class Solution {
    public int[] twoSum(int[] n, int target) {
        
        int i = 0, j = 1, rem;
        while (i < j && j < n.length)
        {
            while (i < j && j < n.length && n[i] + n[j] <= target)
            {
             if (n[i] + n[j] == target)
             {
                return new int[]{i+1,j+1};
             }
             j++;
            }
            i++;
            j = i+1;
        }

        return new int[]{};
    }
}
