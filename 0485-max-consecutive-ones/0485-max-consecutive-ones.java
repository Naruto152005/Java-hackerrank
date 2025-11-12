class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int max=0;
        // int target=1;
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         count++;
        //         max=Math.max(max,count);
        //         if(i< nums.length-1&&nums[i+1]==0)
        //             count=0;
        //     }
        // }
        // return max;
        
        int c=0;int max =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1) c++;
            else c=0;
            max = Math.max(max,c);
        }
        return max;
    }
}