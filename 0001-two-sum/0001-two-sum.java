class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int needed=target-nums[i];
            if(map.containsKey(needed))
            {
                return new int[]{map.get(needed),i};
            }
            map.put(nums[i],i);// initailly our hashmap is empty that why we have to put element like this like map.put(nums[i]-->2,index-->1)
        }
        return new int[]{-1,-1};
    }
}