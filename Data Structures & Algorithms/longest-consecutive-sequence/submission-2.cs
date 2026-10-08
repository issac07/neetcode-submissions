public class Solution {
    public int LongestConsecutive(int[] nums) 
    {
        HashSet<int> set = new HashSet<int>();

        foreach (int val in nums)
        {
            set.Add(val);
        }

        int res = 0;

        foreach (int val in nums)
        {
            int curr = val, c = 0;
            if (!set.Contains(curr - 1))
            {
                while (set.Contains(curr))
                {
                    c++;
                    curr = curr + 1;
                }
            }

            res = Math.Max(c, res);
        }

        return res;
    }
}
