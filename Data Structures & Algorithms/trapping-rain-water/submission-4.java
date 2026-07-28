class Solution {
    public int trap(int[] height) {
                if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;           //r = 9 
        int leftMax = height[l], rightMax = height[r];     // lm = 0, rm = 1, res = 0
        int res = 0;                                                        
        while (l < r) {
            if (leftMax < rightMax) {
                l++;                                        // l = 3
                leftMax = Math.max(leftMax, height[l]);     // lm = 3 
                res += leftMax - height[l];                 // res = 0 +2 + 0
            } else {
                r--;                                        // r = 3
                rightMax = Math.max(rightMax, height[r]);   // rm =3
                res += rightMax - height[r];                // res = 0 +2 + 3 + 2 + 0
            }
        }
        return res;
    }
}
