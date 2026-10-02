public class Solution {
    public int ClimbStairs(int n) 
    {     
        int[] cache = new int[n];

        for (int i = 0; i < n; i++)
        {
            cache[i] = -1;
        }

        return DFS(n, 0, cache);
    }

    public int DFS(int n, int i, int[] cache)
    {
        if (i >= n) 
        {
            return i == n ? 1 : 0;
        }

        if (cache[i] == -1)
        {
            cache[i] = DFS(n, i + 1, cache) + DFS(n, i + 2, cache);
        }

        return cache[i];
    }
}
