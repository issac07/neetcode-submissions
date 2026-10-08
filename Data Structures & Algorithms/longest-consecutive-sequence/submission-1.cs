public class Solution {
    public int LongestConsecutive(int[] nums) 
    {
        HashSet<int> set = new HashSet<int>();

        for (int i = 0; i < nums.Length; i++)
        {
            set.Add(nums[i]);
        }

        int res = 0;

        for (int i = 0; i < nums.Length; i++)
        {
            if (!set.Contains(nums[i] - 1))
            {
                int j = nums[i], count = 1;                
                
                while (set.Contains(j+1))
                {
                    count++;
                    j++;
                }
                res = Math.Max(res, count);                
            }
        }
        return res;
    }
}
