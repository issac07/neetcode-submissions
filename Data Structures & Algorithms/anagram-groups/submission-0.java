class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> m = new HashMap<>();
        for (int i = 0; i < strs.length; i++)
        {
            char[] t = strs[i].toCharArray();
            Arrays.sort(t);
            String sTemp = String.valueOf(t);
            if (!m.containsKey(sTemp))
            {
                m.put(sTemp, new ArrayList<>());
            }
            m.get(sTemp).add(strs[i]);
        }
        return new ArrayList<>(m.values());
    }
}
