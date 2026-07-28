class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length <=1)
        {
            return nums;
        }
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
          
        map =  map.entrySet()
      .stream()
      .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        int[] res = new int[k];
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if (j == k)
                break;
            res[j++] = entry.getKey();
        }
        return res;
    }
}
