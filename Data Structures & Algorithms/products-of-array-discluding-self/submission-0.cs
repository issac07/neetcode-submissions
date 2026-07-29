public class Solution {
    public int[] ProductExceptSelf(int[] nums) 
    {
        int[] prefixLeft = new int[nums.Length];
        int[] prefixRight = new int[nums.Length];
        int preLeft = 1, preRight = 1;

        prefixLeft[0] = 1; prefixRight[nums.Length - 1] = 1;
        for (int i = 1, j = nums.Length - 2; i <nums.Length && j >= 0; i++, j--)
        {
           preLeft *= nums[i-1];
           preRight *= nums[j+1];

           prefixLeft[i] = preLeft;
           prefixRight[j] = preRight; 
        }

        int[] res = new int[nums.Length];

        for (int i = 0; i < nums.Length; i++)
        {
            res[i] = prefixLeft[i] * prefixRight[i];
        }

        return res;
    }
}
