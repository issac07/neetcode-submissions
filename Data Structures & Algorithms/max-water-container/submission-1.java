class Solution {
    public int maxArea(int[] h) {
        
        int max = 0;

        int i = 0, j = h.length-1;

        while (i < j)
        {
            max = Math.max(max, ((j - i)* Math.min(h[i], h[j])));

            if ( h[i] > h[j])
            {
                j--;
            }
            else
            {
                i++;
            }
 
        }

        return max;

    }
}
