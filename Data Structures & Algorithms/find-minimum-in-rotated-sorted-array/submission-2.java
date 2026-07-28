class Solution {
    public int findMin(int[] nums) {

        if (nums.length == 1)
        {
            return nums[0];
        }

        int l = 0, r = nums.length - 1, res = nums[0];

        while (l <= r)
        {
            if ( nums[l] < nums[r])
            {
                return Math.min(res,nums[l]);
            }
            
            int mid = l + ((r - l) / 2);
            
            res = Math.min(res, nums[mid]);
            
            if (nums[mid] >= nums[l])
            {
                l = mid + 1; // 0
            }
            else 
            {
                r = mid - 1;
            }
        }
        
        return res;
    }
}
