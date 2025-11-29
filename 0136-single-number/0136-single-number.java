class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer>map=new HashMap<>();
        // if(nums.length<=1)return nums[0];
        // int count=0;
        // for(int num:nums)
        // {
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     count=map.getOrDefault(nums[i],0);
        //     if(count==1)
        //     return nums[i];
        // }
        // return -1;
        int rem=0;
        for(int i=0;i<nums.length;i++)
        {
            rem=rem^nums[i];   
        }
        return rem;
    }
}