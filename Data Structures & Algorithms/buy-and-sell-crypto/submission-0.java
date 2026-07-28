class Solution {
    public int maxProfit(int[] p) {
        
        if (p.length < 2)
        {
            return 0;
        }
        int l = 0 , r = 1, prof = 0, min = p[0];

        while (l < r && r < p.length)
        {
            min = Math.min(min, p[l]);
            if (p[l] < p[r])
            {
                prof = Math.max (prof, (p[r] - min));             
            }
            
            l++;
            r++;  
        }
        return prof;      
    }
}
