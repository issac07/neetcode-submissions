public class Solution {
    public int[] TopKFrequent(int[] nums, int k) 
    {
        int[] res = new int[k];
        Dictionary<int, int> dict = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            if (dict.ContainsKey(nums[i]))
            {
                dict[nums[i]]++;
            }
            else
            {
                dict[nums[i]] = 1;
            }
        }

        List<int>[] buckets = new List<int>[nums.Length+1];
        for (int i = 0; i < nums.Length+1; i++)
        {
            buckets[i] = new List<int>();
        }

        foreach (var entry in dict)
        {
            buckets[entry.Value].Add(entry.Key);
        }

        int c = 0;

        for (int i = buckets.Length - 1; i >= 0 ; i--)
        {
            foreach (var val in buckets[i])
            {
                if (c < k)
                {
                    res[c] = val;
                    c++;
                }
                else
                {
                    break;
                }
            }
        }

        return res;
    }
}
