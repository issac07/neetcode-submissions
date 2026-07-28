class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);
        s = String.valueOf(sArr);
        t = String.valueOf(tArr); 
        if (s.equals(t))
        {
            return true;
        }

        return false;
    }
}
